package com.puyitou.fundmanager.auth.system.util;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DesUtils {

	private static final String CHARSET = "utf-8";
	
	public static String encrypt(String data, String key) throws Exception {
		byte[] bytes = data.getBytes(CHARSET);
		byte[] encryptData = encrypt(bytes, key);
		return Base64.getEncoder().encodeToString(encryptData);
	}
	
	public static String decrypt(String data, String key) throws Exception {
		byte[] bytes = Base64.getDecoder().decode(data);
		byte[] decryptData = decrypt(bytes, key);
		return new String(decryptData, CHARSET);
	}
	
	public static byte[] encrypt(byte[] data, String key) throws Exception {
        SecureRandom random = new SecureRandom();
        DESKeySpec desKey = new DESKeySpec(key.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(desKey);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
        return cipher.doFinal(data);
		
	}
	
	public static byte[] decrypt(byte[] data, String key) throws Exception {
        SecureRandom random = new SecureRandom();
        DESKeySpec desKey = new DESKeySpec(key.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(desKey);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        return cipher.doFinal(data);
	}
	
}
