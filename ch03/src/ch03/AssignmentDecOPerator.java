package ch03;
//���Կ��� :������ ������ ����� ���� ���� ������ �����ϴ� ����
public class AssignmentDecOPerator {
	public static void main(String[] args) {
		
	  int a=3,b=3,c=3;
	  
	  //���Կ����� 
	  a+=3;//a=a+3;
	  System.out.println(a);
	  b*=3;//b=b*3;
	  System.out.println(b);
	  c%=2;//c=c%2;
	  System.out.println(c);
	  
	  int d=3;
	  a=d++;// d++ => d=d+1, d+=1;
	  System.out.println(a);
	  a=++d;// ++d => d=d+1
	  System.out.println(a);
	  a=d--;//d-- => d=d-1, d-=1;
	  System.out.println(a);
	  a=--d;//--d => d=d-1
	  System.out.println(a);
	  
	  //�ݺ���
	  //for�ݺ��� for(�ʱⰪ;���ᰪ;��/��){��ɹ�}
	  for(int i=1;i<=5;i++){
		  System.out.println(i);
	  }
	  //1���� 2�� ������ �� ���
	  System.out.println("------------");
	  for(int i=1;i<=5;i+=2){
		  System.out.println(i);
	  }
	  //10���� 2�� ������ �� ���
	  System.out.println("------------");
	  for(int i=10;i>=0;i-=2) {
		  System.out.println(i);
	  }
	  
	  
	  
	  
	  
	  

	}

}
