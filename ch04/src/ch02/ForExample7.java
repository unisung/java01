package ch02;
//for���� �̿��Ͽ� 10����1���� ������ ǥ���ϰ� ���� ���ϴ� ����
public class ForExample7 {
	public static void main(String[] args) {
	 int sum=0;
	 
	 for(int i=10;i>=1;i--) {
		 sum+=i;//sum=sum+i;
		 System.out.print(i);
		 
		 if(i>1) System.out.print("+");//���ٷ� �̾ ��� print()
		 else {
			 System.out.print("=");
			 System.out.println(sum);//����� ���� �ٷ� �̵� println();
		 }
	 }//for����.

	}

}
