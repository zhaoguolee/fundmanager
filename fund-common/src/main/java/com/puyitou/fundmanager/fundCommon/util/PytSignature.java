package com.puyitou.fundmanager.fundCommon.util;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.digest.DigestUtils;

public class PytSignature {

	public static String md5Signature(Map<String, String> params, long timeStamp, String key, String token) {
		String data = "key=" + key + "&token=" + token + "&timestamp=" + timeStamp;
		if (null != params) {
			for (Entry<String, String> entry : params.entrySet()) {
				data += "&" + entry.getKey() + "=" + entry.getValue();
			}
		}
		return DigestUtils.md5Hex(data);
	}
	
}
