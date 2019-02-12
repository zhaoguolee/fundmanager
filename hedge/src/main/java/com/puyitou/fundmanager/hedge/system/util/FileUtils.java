package com.puyitou.fundmanager.hedge.system.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/** 私募2.0
 * @author zby
 * @Description: 文件下载工具类
 * @date: 2018年11月5日 上午17:13:05
 */
public class FileUtils {
	  
	 private final static Logger LOGGER = LoggerFactory.getLogger(FileUtils.class);
	  public static void downloadFile(HttpServletResponse response, String filePath)
		        throws RuntimeException
		    {
		        File file = new File(filePath);
		        if(!file.exists()){
		            throw new RuntimeException("文件不存在");
		        }
		        BufferedInputStream bin = null;// 输入流缓存流
		        BufferedOutputStream bout = null;// 输出流缓存流
		        try
		        {
		            //缓存流
		            bin = new BufferedInputStream(new FileInputStream(file));
		            bout = new BufferedOutputStream(response.getOutputStream());
		            byte[] b = new byte[1024 * 5];// 缓存数组
		            int len = 0;
		            while ((len = bin.read(b)) != -1)
		            {
		                bout.write(b, 0, len);
		                bout.flush();
		            }
		        }
		        catch (FileNotFoundException e)
		        {
		        	LOGGER.error("文件不存在", e);
		            //这里抛出RuntimeException,实际时抛出自定义异常,方便在上一层捕捉自定义异常,对异常信息统一管理,并返会前台
		            throw new RuntimeException("文件读取异常");
		        }
		        catch (IOException e)
		        {
		        	LOGGER.error("下载文件IO异常", e);
		            throw new RuntimeException("文件读取异常");
		        }
		        finally
		        {
		            try
		            {
		                // 关闭缓存流的时候会将输入输出流给关闭
		                if (bin != null)
		                {
		                    bin.close();
		                }
		                if (bout != null)
		                {
		                    bout.close();
		                }
		            }
		            catch (IOException e)
		            {
		            	LOGGER.error("文件下载异常", e);
		                throw new RuntimeException("文件读取异常");
		            }
		        }

		    }
		
}
