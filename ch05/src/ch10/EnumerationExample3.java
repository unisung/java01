package ch10;

import java.util.Scanner;

public class EnumerationExample3 {
	public static void main(String[] args) {
	 LoginResult result=null;
	 Scanner scanner = new Scanner(System.in);
	 int count=0;
	 
	 while(true) {
	 System.out.println("���̵� �Է��ϼ���:");
	 String id=scanner.next();
	 System.out.println("����� �Է��ϼ���:");
	 String pwd=scanner.next();
	 
	 if(id.equals("hong") & pwd.equals("1234"))
		 result=LoginResult.LOGIN_SUCCESS;
	 else {
		  result=LoginResult.LOGIN_FAILED;
		   count++;
		   if(count==3) {
			   System.out.println("3ȸ �߸��Է��ϼ̽��ϴ�. �����մϴ�.");
			   break;
		   }
	    }
	 System.out.println("���:"+result);
	 
	 }//while�� ��.
	 System.out.println("���α׷� ����");
	 
	}

}
