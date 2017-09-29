package com.crodriguezt.dev.privpasarelaapi.common;

public class GenericUtils {

	public static String bytesToHex(byte[] hash) {
		System.out.println("en funcion: "+ hash);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1) {
				System.out.println("-->sb: "+ sb);
				sb.append("0");
				sb.append(hex);
				System.out.println("----->sb: "+ sb);
			}
		}
		return sb.toString();
	}
}
