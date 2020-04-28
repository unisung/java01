package ch01;

public class BitReverseOperationExam2 {
	public static void main(String[] args) {
		int v1=10;
		int v2=~v1;//비트반전 1의보수


		for(int i=1;i<11;i++) {
			System.out.println(Integer.toBinaryString(~i));
		}		
	}
	//메소드 
	//접근지정자 생성장소지정자 리턴타입 메소드명(매개변수타입 매개변수명){실행문;}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			//System.out.println(str);
			str="0"+str;//1010 => 01010=>001010=>0001010=>00001010
		}
		return str;//함수(메소드)에서 return문을 만나면 종료하고 호출한곳으로 이동.
		           //return 값; 이면 값을 리턴함.
	}
}
