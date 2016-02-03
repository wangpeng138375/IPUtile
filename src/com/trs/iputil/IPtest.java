package com.trs.iputil;

import com.trs.iputil.IPSeeker;

public class IPtest {

	public static void main(String[] args) {
		IPSeeker ip=IPSeeker.getIPSeeker();
		System.out.println(ip.getIPLocation("180.154.57.11").getCountry()+":"+ip.getIPLocation("180.154.57.11").getArea());
	}
}

