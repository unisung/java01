package ch05.ch04;

public class CarMainExample {

	public static void main(String[] args) {
		Car car = new Car(new Tire(),new KumhoTire(),
				          new HankookTire(),new KumhoTire());
		//메소드 매개변수의 다형성
		car.setTire1(new HankookTire());
		//Tire tire=new HankookTire();
	}

}
