package jp.co.axiz.entity;

public class Car {
	private String carName;
	private String bodyColor;
	private int maxSpeed;
	private int speed;
	
	public Car() {
		
	}
	
	public Car(String carName, String bodyColor, int maxSpeed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String carName, String bodyColor, int maxSpeed, int speed) {
		this.carName = carName;
		this.bodyColor = bodyColor;
		this.maxSpeed = maxSpeed;
		this.setSpeed(speed);
//		this.speed = speed;
	}
	
	public String getCarName() {
		return this.carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getBodyColor() {
		return this.bodyColor;
	}
	
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed >= 0) {
			this.maxSpeed = maxSpeed;
		}else {
			System.out.println("最高速度にこの値(" + maxSpeed + ")はセットすることはできません");
		}
		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if(speed <= this.maxSpeed && speed >= 0) {
			this.speed = speed;
		}else {
			System.out.println("現在速度にこの値(" + speed + ")はセットすることはできません");
		}
	}
}
