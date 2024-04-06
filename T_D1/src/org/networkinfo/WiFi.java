package org.networkinfo;

public class WiFi {
private void wifiName() {
	// TODO Auto-generated method stub
System.out.println("wifi - airtel wifi");
}
public static void main(String[] args) {
	WiFi w = new WiFi();
	MobileData md = new MobileData();
	Lan l = new Lan();
	Wireless wl = new Wireless();
	w.wifiName();
	md.dataName();
	l.lanName();
	wl.modemName();
}
}
