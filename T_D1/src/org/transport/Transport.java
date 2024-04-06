package org.transport;
import org.road.*;
import org.air.*;
import org.water.*;

public class Transport {
public void transportForm() {
	// TODO Auto-generated method stub
System.out.println("vehicles and modes of transportation");
}
public static void main(String[] args) {
	Transport t = new Transport();
	t.transportForm();
	Road r = new Road();
	Water w = new Water();
	Air a = new Air();
	r.bike();
	r.bus();
	r.car();
	r.cyccle();
	w.boat();
	w.ship();
	a.aeroPlane();
	a.heliCopter();
}
}

