package TireField;

public class Tire {

	public int maxRotation; // 최대 회전수(최대수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// Method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Left Tire: " + (maxRotation - accumulatedRotation) + "Time");
			return true;
		} else
			System.out.println("***" + location + " Tire flat ");
		return false;
	}
}