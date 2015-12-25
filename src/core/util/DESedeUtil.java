package core.util;

import java.io.IOException;
import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * DESede加解密
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
public class DESedeUtil {

	public static final String DESede = "DESede";
	public static final String DESede_KEY = "SHPDESededb!@#$%12345678";

	public static String decode(String secretKey, String cipherText) throws GeneralSecurityException {
		byte[] key = secretKey.getBytes();
		SecretKeySpec k = new SecretKeySpec(key, DESede);
		Cipher cp = Cipher.getInstance(DESede);
		cp.init(Cipher.DECRYPT_MODE, k);
		byte[] srcByte = cp.doFinal(cipherText.getBytes());
		return new String(srcByte);
	}

	public static String decode(String secretKey, byte[] cipherByte) throws GeneralSecurityException {
		byte[] key = secretKey.getBytes();
		SecretKeySpec k = new SecretKeySpec(key, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.DECRYPT_MODE, k);
		byte[] srcByte = cipher.doFinal(cipherByte);
		return new String(srcByte);
	}
	
	public static String decode(String cipherText) throws GeneralSecurityException, IOException{
		byte[] key = DESede_KEY.getBytes();
		SecretKeySpec k = new SecretKeySpec(key, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.DECRYPT_MODE, k);
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] buf = decoder.decodeBuffer(cipherText);
		byte[] srcByte = cipher.doFinal(buf);
		return new String(srcByte);
	}

	public static String encode(String secretKey, String srcText) throws GeneralSecurityException {
		byte[] key = secretKey.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] cipherByte = cipher.doFinal(srcText.getBytes());
		return new String(cipherByte);
	}
	
	public static String encode(String secretKey, byte[] srcByte) throws GeneralSecurityException {
		byte[] key = secretKey.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] cipherByte = cipher.doFinal(srcByte);
		return new String(cipherByte);
	}
	
	public static String encode(String srcText) throws GeneralSecurityException{
		byte[] key = DESede_KEY.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] cipherByte = cipher.doFinal(srcText.getBytes());
		String str = new BASE64Encoder().encode(cipherByte);
		return str;
	}
	
	public static void main(String[] args) throws GeneralSecurityException, IOException {
		String data = "www.shp.com";
		System.err.println(encode(data));
		System.err.println(decode(encode(data)));
	}

}
