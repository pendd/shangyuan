package com.day01;

public class SellTicket extends Thread {
	//���趨��һ����Ʊ
	private static int tickets=100;
	public void run() {
		
		//������Ʊ����
		while(true) {
			//�ж�Ʊһ�����Ǹ�����0
			if(tickets>0) {
				System.out.println(getName()+"�����۳���"+(tickets--)+"��Ʊ");
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		SellTicket s1 = new SellTicket();
		SellTicket s2 = new SellTicket();
		SellTicket s3 = new SellTicket();
		
		s1.setName("����1");
		s2.setName("����2");
		s3.setName("����3");
		
		s1.start();
		s2.start();
		s3.start();
	}
}
