package ch01;
//리터럴 - 문자 리터럴
public class LiteralExam6 {
	public static void main(String[] args) {
		//홑따옴표로 묶은 테스트는 하나의 문자 리터럴로 간주
		char ch1 = 'A';//문자 리터럴 ' '
		char ch2 = '한';
		char ch3 = '\t';
		char ch4 = '\n';
		//char ch5 = "A";//문자열 리터럴 ""
		String str5 = "A";
		char ch6=' ';//char(문자)타입 변수에는 문자리터럴 공백(' ')초기화 가능
	    //ch6='AB';//문자타입에는 한자(1개)만 허용
		str5="";//빈문자열("") 대입 가능
		str5="ABC";//두개이상의 문자입력 가능
		
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("ch3="+ch3);
		System.out.println("ch4="+ch4);
		System.out.println("str5="+str5);

	}
}
