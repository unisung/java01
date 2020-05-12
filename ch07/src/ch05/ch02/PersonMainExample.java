package ch05.ch02;

public class PersonMainExample {
  public static void main(String[] args) {
  Student student 
       = new Student("홍길동");
 System.out.println("1."+student.name);
   student.grade="A";
   
   //부모타입으로 대입(Promotion)
   Person person= student;
 System.out.println("2."+person.name);
 //부모타입으로 promotion된 객체는
 //자식타입클래스에서 추가된 맴버는 접근불가
 //System.out.println(person.grade);
   //person.getGrade();
 //재정의된 메소드 실행
  System.out.println("3."+person.getName());
  Student s =(Student)person;
  //다시 원래타입으로 환원(casting)되면 추가된 자식클래스맴버에 접근가능
  System.out.println("4."+s.grade);
   System.out.print("5.");
   s.getGrade();
  System.out.println("6."+s.getName());
   

	}

}
