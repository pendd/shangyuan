package com.day01;

public class SellTicket extends Thread {
	//假设定义一百张票
	private static int tickets=100;
	public void run() {
		
		//假设有票售卖
		while(true) {
			//判断票一定不是负数或0
			if(tickets>0) {
				System.out.println(getName()+"正在售出第"+(tickets--)+"张票");
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		SellTicket s1 = new SellTicket();
		SellTicket s2 = new SellTicket();
		SellTicket s3 = new SellTicket();
		
		s1.setName("窗口1");
		s2.setName("窗口2");
		s3.setName("窗口3");
		
		s1.start();
		s2.start();
		s3.start();
	}
}
