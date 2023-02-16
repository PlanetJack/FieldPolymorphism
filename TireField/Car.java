package TireField;

public class Car {

	//Field
	Tire frontLeftTire = new Tire("FrontLeft", 6);
	Tire frontRightTire = new Tire("frontRight", 2);
	Tire backLeftTire = new Tire("backLeft", 3);
	Tire backRightTire = new Tire("backRight", 4);
	
	//Constructor
	
	
	//Method
	int run() {
		System.out.println("Running Car ***");
		if(frontLeftTire.roll()==false) {stop(); return 1;};
		if(frontRightTire.roll()==false) {stop(); return 2;};
		if(backLeftTire.roll()==false) {stop(); return 3;};
		if(backRightTire.roll()==false) {stop(); return 4;};
		return 0;
	}
	void stop() {
		System.out.println("Stopped Car ***");
	}
}
