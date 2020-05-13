package ch06.ch01;

public class AnimalMainExample {
	public static void main(String[] args) {
		//실체를 만들수 없는 클래스=추상클래스
		//Animal animal = new Animal();
		Animal animal = new Cat();
		animal = new Dog();
		animal.field1=3;
	    animal.f1();
	}
}
