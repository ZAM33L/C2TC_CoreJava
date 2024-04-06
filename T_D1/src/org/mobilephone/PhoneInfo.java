package org.mobilephone;

public class PhoneInfo {
private void phoneName() {
	// TODO Auto-generated method stub
	System.out.println("samsung");
}
private void phoneIMEINum() {
	// TODO Auto-generated method stub
	System.out.println(113456);

}
private void camera() {
	// TODO Auto-generated method stub
	System.out.println("128 MP");
}
private void storage() {
	// TODO Auto-generated method stub
	System.out.println("256 gb");
}
private void osName() {
	// TODO Auto-generated method stub
	System.out.println("android");
}
public static void main(String[] args) {
	PhoneInfo pi = new PhoneInfo();
	pi.phoneName();
	pi.camera();
	pi.osName();
	pi.phoneIMEINum();
	pi.storage();
}
}

