package ch02;
//1���� 100������ ���� �߿��� 
//3�Ǵ� 4�� ����� �ƴ� ������ ���� ����ϴ� -3����� �ƴϰ� 4�� ����� �ƴѼ���
//���α׷��� �ۼ��ϼ���
public class ContinueExam {
	public static void main(String[] args) {
	   int sum=0;//�������� ����
	  for(int i=1;i<=100;i++) {
		  if(i%3==0 || i%4==0) continue;
		  sum+=i;//sum=sum+i;
	  }//�ݺ��� ��.
	  System.out.println(sum);
	  

	}

}
