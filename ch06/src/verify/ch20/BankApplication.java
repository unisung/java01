package verify.ch20;

import java.util.Scanner;

public class BankApplication {
	private static final int ANO_NO=111;
	private static int seq;
    private static Account[] accountArray=new Account[100];
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	  boolean run=true;
	  while(run) {
		  System.out.println("----------------------------------------------");
		  System.out.println("1.���»���|2.���¸��|3.����|4.���|5.��ü|6.Ż��|7.����");
		  System.out.println("----------------------------------------------");
		  System.out.print("����>");
		  
		  int selectNo = scanner.nextInt();
		  switch(selectNo) {
		  case 1: createAccount(); break;
		  case 2: accountList(); break;
		  case 3: deposit(); break;
		  case 4: withdraw(); break;
		  case 5: transfer(); break;
		  case 6: secession(); break;
		  default: run=false;
		  }
		  
	  }//while�� ��.
	  System.out.println("���α׷� ����");
	}//main() �޼ҵ� ��.

	//���»����ϱ�
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		//System.out.println("���¹�ȣ:");
		//String ano=scanner.next();
		System.out.println("������:");
		String owner=scanner.next();
		System.out.println("�ʱ��Աݾ�:");
		int balance=scanner.nextInt();
		Account account = new Account(ANO_NO+"-"+(++seq)+seq+seq, owner, balance);
		//System.out.println(account);
		for(int i=0;i<accountArray.length;i++) {
		     if(accountArray[i]==null) {
			    accountArray[i]=account;
			    break;
		     }
		}
	}
	//���¸�Ϻ���
	private static void accountList() {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null)
			System.out.println(accountArray[i]);
		}
	}
	//�����ϱ�
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("����");
		System.out.println("-------------");
		System.out.println("���¹�ȣ:");
		String ano = scanner.next();
		System.out.println("�Աݾ�:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(balance);
		System.out.println("���:������ �����Ǿ����ϴ�.");
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		System.out.println("���¹�ȣ:");
		String ano = scanner.next();
		System.out.println("��ݾ�:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(-balance);
		System.out.println("���:����� �����Ǿ����ϴ�.");
	}
	//������ü
	private static void transfer() {
		//
		System.out.println("��ü");
		System.out.println("��ݰ��¹�ȣ�� �Է��ϼ���>");
		System.out.println("�����¹�ȣ�� �Է��ϼ���>");
		System.out.println("��ü�ݾ��� �Է��ϼ���>");
		System.out.println("���:��ü�� �����Ǿ����ϴ�.");
	}
	
	//ȸ��Ż��
	private static void secession() {
		System.out.println("Ż��");
		System.out.println("Ż���� ���¹�ȣ�� �Է��ϼ���>");
		System.out.println("���� Ż���Ͻðڽ��ϱ�?(y/n)");
		System.out.println("���:Ż�� ó���� �Ϸ�Ǿ����ϴ�.");
	}
	
	//Account�迭���� ano�� ������ Account ��ü ã��
	private static Account findAcount(String ano) {
		Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					account=accountArray[i];
					break;
				}	
			}
		}
		return account;
	}
}
