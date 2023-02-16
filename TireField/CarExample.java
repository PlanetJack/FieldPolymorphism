package TireField;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=1; i<5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("Change the FrontLeft HankookTire");
				car.frontLeftTire = new HankookTire("FrontLeft", 15);
				break;
			case 2:
				System.out.println("Change the FrontRight KumhoTire");
				car.frontRightTire = new HankookTire("FrontRight", 13);
				break;
			case 3:
				System.out.println("Change the BackLeft HankookTire");
				car.backLeftTire = new HankookTire("BackLeft", 14);
				break;
			case 4:	
				System.out.println("Change the BackRight KumhoTire");
				car.backRightTire = new HankookTire("BackRight", 12);
				break;
			
			
			}
			System.out.println("-----------------------------------------------------");
		}
		
	}

}
