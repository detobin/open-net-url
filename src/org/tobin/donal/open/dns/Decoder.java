package org.tobin.donal.open.dns;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class Decoder {
	public static void main(String[] args) {
		String urlStr = args[0];
		System.out.println(parse(urlStr, true));
		System.out.println(parse(urlStr, false));
	}

	protected static String parse(String urlStr, boolean findRef) {
		try {
			URL url = new URL(urlStr);
			String query = url.getQuery();
			if (query!= null) {
			Map<String, String> paramMap = new HashMap<>();
			if (query.contains("&")) {
				String[] params = query.split("\\&");
				for (String paramLine : params) {
					addToMap(paramMap, paramLine);
				}
			} else {
				addToMap(paramMap, query);
			}
			if (findRef && paramMap.containsKey("ref")) {
				String urlParam = paramMap.get("ref");
				String decode = URLDecoder.decode(urlParam, "UTF-8");
				if (decode.startsWith("http://")
						|| decode.startsWith("https://")) {
					return decode;
				}
				throw new IllegalArgumentException("Unknown url: " + decode);
			} else if (paramMap.containsKey("url")) {
				String urlParam = paramMap.get("url");
				if (urlParam.startsWith("http:")
						|| urlParam.startsWith("https:")) {
					return urlParam;
				}
				String decode = URLDecoder.decode(urlParam, "UTF-8");
				return parse("http://" + decode, findRef);
			} else {
				return urlStr;
			}
			} else {
				return urlStr;
			}
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	private static void addToMap(Map<String, String> paramMap, String paramLine) {
		String[] part = paramLine.split("\\=", 2);
		paramMap.put(part[0], part[1]);
	}

}
