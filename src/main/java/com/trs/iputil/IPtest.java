package com.trs.iputil;

import com.trs.iputil.IPSeeker;

public class IPtest  extends Thread {
	public IPtest() {}

	public void run() {
		for (int i = 0; ; i++) {
			//指定纯真数据库的文件名，所在文件夹
			IPSeeker ip=IPSeeker.getIPSeeker();
			//测试IP 58.20.43.13
			System.out.println(i + " == " + ip.getIPLocation("180.154.57.11").getCountry()+":"+ip.getIPLocation("180.154.57.11").getArea());
		}
	}
	public static void main(String[] args) {
		//		IPtest h1=new IPtest();
		//        h1.run();
		//指定纯真数据库的文件名，所在文件夹
		IPSeeker ip=IPSeeker.getIPSeeker();
		//测试IP 58.20.43.13
		System.out.println(ip.getIPLocation("180.154.57.11").getCountry()+":"+ip.getIPLocation("180.154.57.11").getArea());
	}
}

