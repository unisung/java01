package ch02;
//for���� �̿��Ͽ� 1����10���� ������ ǥ���ϰ� ���� ���ϴ� ����
public class ForExample6 {
	public static void main(String[] args) {
	 int sum=0;
	 
	 for(int i=1;i<=10;i++) {
		 sum+=i;//sum=sum+i;
		 System.out.print(i);
		 
		 if(i<=9) System.out.print("+");//���ٷ� �̾ ��� print()
		 else {
			 System.out.print("=");
			 System.out.println(sum);//����� ���� �ٷ� �̵� println();
		 }
	 }//for����.

	}

}