package org.sfa.ghs.acars;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class SunBase64 {

	public static String encode(String code) {
		try {
			return new BASE64Encoder().encode(code.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decode(String code) throws Exception {
		return new String(new BASE64Decoder().decodeBuffer(code), "UTF-8");
	}

}
