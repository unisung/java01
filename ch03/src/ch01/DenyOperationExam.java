package ch01;

public class DenyOperationExam {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);//true
		
		play=!play;// !true ->false
		
		System.out.println(play);
		
		play=!play;//true
		
		while(play) {
			System.out.println("hello");
			System.out.println("����ұ��?");
			char yesNo='n';
			if(yesNo=='n') {// 'n'=='n'
				play=!play;
			}
		}
		System.out.println("����");
	}
}