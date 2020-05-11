package ch10.verify;

import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		//Car타입 배열생성
		Car[] cars=new Car[3];
		//Car타입 배열에 Car객체 생성 및 저장
		for(int i=0;i<cars.length;i++) {
		  System.out.println("차종>");
		  String kind=scanner.next();
		  System.out.println("입차시각(숫자):");
		  int inTime = scanner.nextInt();
		 cars[i]=new Car(kind, inTime);
		/*
		 * cars[1]=new Car("Suv",13); cars[2]=new Car("Truck",14);
		 */
		}
        	
		//출차시간 등록
		for(int i=0;i<cars.length;i++) {
		 System.out.println("출차시각(숫자):");
		 int outTime = scanner.nextInt();
			cars[i].setOutTime(outTime);
			/*
			 * cars[1].setOutTime(18); cars[2].setOutTime(17);
			 */
		}
		
		//차량별 주차비 출력
        for(int i=0;i<cars.length;i++) {
        	 Car c = cars[i];
        	 calc(c);//주차비 계산 메소드 caclc()호출
        }
	}
	//sedan:시간당 3000원, suv:시간당 5000원, Truck:시간당 7000원
			//12시간초과시 일괄 50000원 징수
			//입차시간과 출차시간을 입력하여 계산.
	//
	static void calc(Car car) {
		//출차시각 - 입차시각 = 주차시간
		int term=car.getOutTime()-car.inTime;
		double fee=0;
		if(term>12) { 
			fee=50000;//주차시간이 12시간 초과시 는 일괄 징수
		}else if(Kind.Sedan==Kind.valueOf(car.kind)) {
            fee=3000*term;			
		}else if(Kind.Suv==Kind.valueOf(car.kind)) {
			fee=5000*term;
		}else if(Kind.Truck==Kind.valueOf(car.kind)) {
			fee=7000*term;
		}
		System.out.println("입차시각:"+car.inTime+",출차시각:"
		                   +car.getOutTime()+",주차비:"+fee);
	}
}
