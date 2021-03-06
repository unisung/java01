package ch05.ch06;

public class Car {
    //필드
	String company;
	String model;
	int year;
	//생성자
	Car(){}//Default생성자
	Car(String company){//매개변수 String 1개짜리 생성자
		this.company=company;
	}
	Car(String company,String model){//매개변수 String,String 두개짜리 생성자
		this(company);//위의 매개변수 1개짜리 생성자 호출
		this.model=model;
	}
	//매개변수 String,String,int 3개짜리 생성자
	Car(String company,String model, int year){
		this(company,model);//우의 매개변수2개짜리 생성자 호출
		this.year=year;
	}
	//매개변수의 타입,갯수,순서가 다르면 다른생성자로 인식
	Car(String company,int year,String model){
		this.company=company;
		this.model=model;
		this.year=year;
	}
	Car(int year,String model,String company){
		this.company=company;
		this.model=model;
		this.year=year;
	}
	//자바는 매개변수의 타입으로 만 구분, 매개변수명은 무관
	//Car(int year,String company,String model){
	//	this.company=company;
	//	this.model=model;
	//	this.year=year;
	//}
	//메소드
}
