package com.day03;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {
		//����1 java.util.Date 
		Class c1 = Class.forName("java.util.Date");
		System.out.println(c1);
		
		//����2
		Class c2 = Date.class;
		System.out.println(c2);
		
		//����3
		Date d = new Date();
		Class c3 = d.getClass();
		System.out.println(c3);
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		//ԭ���Ƿ����ʵ�ַ��� int ����
		Class i = int.class;
		System.out.println(i);
	}
}
