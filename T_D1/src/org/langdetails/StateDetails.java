package org.langdetails;


public class StateDetails {
private void southIndia() {
	// TODO Auto-generated method stub
	System.out.println("tamilnadu");

}
private void northIndia() {
	// TODO Auto-generated method stub
	System.out.println("delhi");

}
public static void main(String[] args) {
	LanguageInfo li = new LanguageInfo();
	StateDetails sd = new StateDetails();
	li.tamil();
	li.english();
	sd.southIndia();
	sd.northIndia();
}
}
