package ch03;
//���׿���: �ǿ������� ���� 3���� ����
public class ConditionalOperationExample1 {
	public static void main(String[] args) {
		int score =75;
		char grade;
		if(score>90) {
			grade='A';
		}else if(score>80) {
			grade='B';
		}else if(score>70){
			grade='C';
		}else {
			grade='F';
		}
		
		
		System.out.println(grade);
		
		//���׿����
		grade = score>90?'A' :score>80?'B':score>70?'C':'F' ;
		System.out.println(grade);
		
	
	}

}
