package org.network;

public class WiFi {
public void wifiName() {
	// TODO Auto-generated method stub
System.out.println("msajce wifi");
}
public static void main(String[] args) {
	WiFi w = new WiFi();
	MobileData md = new MobileData();
	Lan l = new Lan();
	w.wifiName();
	md.dataName();
	l.lanName();
}
}
