package com.api.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetHeadersAndParams {
	List<String> headerVal = new ArrayList<String>();
	List<String> headers = new ArrayList<String>();
	List<String> params = new ArrayList<String>();
	List<String> paramVal = new ArrayList<String>();
	List<String> finale = new ArrayList<String>();

	public List<String> getHeaders(String header) {
		headerVal = stringToList(header);
		return headerVal;

	}
	
	public List<String> getHeaderValues(String header) {
		headers = stringToList(header);
		return headers;

	}

	public List<String> stringToList(String stringToConvert) {

		return Arrays.asList(stringToConvert.split(";"));
	}
	
}
