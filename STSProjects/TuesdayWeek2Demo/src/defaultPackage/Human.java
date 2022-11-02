package defaultPackage;

public class Human {
	private double height;
	private String eyeColor;
	private int age;
	private String hairColor;
	
	public Human(double height, String eyeColor, int age, String hairColor) {
		this.height = height;
		this.eyeColor = eyeColor;
		this.age = age;
		this.hairColor = hairColor;
	}
	
	public Human() {
		this.height = 80.2;
		this.eyeColor = "brown";
		this.age = 26;
		this.hairColor = "brown";
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
}