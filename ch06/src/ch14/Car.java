package ch14;

public class Car {
	//�ʵ�
	public String company;
	public String model;
	public int maxSpeed;
	//������
	public Car() {
	}
	public Car(String company) {
		this.company = company;
	}
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public Car(String company, String model, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//�޼ҵ�
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
	

}
