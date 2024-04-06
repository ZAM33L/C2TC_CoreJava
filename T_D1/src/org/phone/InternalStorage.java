package org.phone;

public class InternalStorage {
	private void sizeInt() {
		// TODO Auto-generated method stub
		System.out.println("internal storage is 64 gb");

	}
public static void main(String[] args) {
	InternalStorage ist = new InternalStorage();
	ExternalStorage est = new ExternalStorage();
	ist.sizeInt();
	est.sizeExt();
}
}
