package org.sfa.ghs.acars;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class ApacheBase64 {

	public static String encode(String str) {
		try {
			return new String(Base64.encodeBase64(str.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String decode(String str) {
		try {
			return new String(Base64.decodeBase64(str.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

}
