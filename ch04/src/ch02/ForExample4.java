package ch02;
//for(�ʱⰪ;������;����){���๮;}
public class ForExample4 {
	public static void main(String[] args) {
	  //1~100������ ������ ���Ѱ���� ���
	  int sum=0;//���Ѱ���� ������ ����  ����,�ʱ�ȭ
	  
	  int i=1;//�ʱ�ȭ
	  for( ; ; ) {
		   if(i>10) break;//��������
		   sum=sum+i;
		   i++;//����
		System.out.println("1����"+i+"������ ������ ��:"+sum);
	  }
	  

	}

}
