package ch06.ch01;

public class School {
	//1번, "홍길동", 80,75,90을 입력받고
	//Student객체를 리턴할수 있도록 메소들 선언
Student getStudent(int sno,String name,int kor,int math,int eng ){
	return new Student(sno,name,kor,math,eng);
}

  //위에서 생성한 Student 객체의 국어(kor),수학(math),영어(eng)
   //점수의 합과 평균을 구하여 리턴하지않고 출력하는 메소드 선언
	void scoreInfo(Student student){
		int sum=student.getKor()+student.getMath()+student.getEng();
		System.out.println("합:"+sum);
		System.out.println("평균:"+(double)sum/3);
		
	}

}
