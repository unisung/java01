package ch06.ch01;

public class School {
	//1��, "ȫ�浿", 80,75,90�� �Է¹ް�
	//Student��ü�� �����Ҽ� �ֵ��� �޼ҵ� ����
Student getStudent(int sno,String name,int kor,int math,int eng ){
	return new Student(sno,name,kor,math,eng);
}

  //������ ������ Student ��ü�� ����(kor),����(math),����(eng)
   //������ �հ� ����� ���Ͽ� ���������ʰ� ����ϴ� �޼ҵ� ����
	void scoreInfo(Student student){
		int sum=student.getKor()+student.getMath()+student.getEng();
		System.out.println("��:"+sum);
		System.out.println("���:"+(double)sum/3);
		
	}

}