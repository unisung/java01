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
		  System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.이체|6.탈퇴|7.종료");
		  System.out.println("----------------------------------------------");
		  System.out.print("선택>");
		  
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
		  
	  }//while문 끝.
	  System.out.println("프로그램 종료");
	}//main() 메소드 끝.

	//계좌생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		//System.out.println("계좌번호:");
		//String ano=scanner.next();
		System.out.println("계좌주:");
		String owner=scanner.next();
		System.out.println("초기입금액:");
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
	//계좌목록보기
	private static void accountList() {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null)
			System.out.println(accountArray[i]);
		}
	}
	//예금하기
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		System.out.println("입금액:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(balance);
		System.out.println("결과:예금이 성공되었습니다.");
	}
	//출금하기
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		System.out.println("출금액:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(-balance);
		System.out.println("결과:출금이 성공되었습니다.");
	}
	//계좌이체
	private static void transfer() {
		//
		System.out.println("이체");
		System.out.println("출금계좌번호를 입력하세요>");
		System.out.println("상대계좌번호를 입력하세요>");
		System.out.println("이체금액을 입력하세요>");
		System.out.println("결과:이체가 성공되었습니다.");
	}
	
	//회원탈퇴
	private static void secession() {
		System.out.println("탈퇴");
		System.out.println("탈퇴할 계좌번호를 입력하세요>");
		System.out.println("정말 탈퇴하시겠습니까?(y/n)");
		System.out.println("결과:탈퇴 처리가 완료되었습니다.");
	}
	
	//Account배열에서 ano와 동일한 Account 객체 찾기
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
