package com.util;

public class ValidationUtil {

	
	
	public  static boolean isEmpty(String param) {
		
		boolean flag = true;
		param = param.trim();
		System.out.println("param  " + param);
		if(!param.equals("") && param!=null) {
			System.out.println("param here....");
			flag = false;
		}
		
		return flag;
		
	}
}
