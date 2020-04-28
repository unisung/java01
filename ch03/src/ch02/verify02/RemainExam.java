package ch02.verify02;
//1. 하나의 상자에 12개씩 담을 수 있는 박스가 있습니다.
//오렌지 127개가 있다면 몇박스를 담을 수 있으며,
//나머지는 몇개입니까?
public class RemainExam {
	
	public static void main(String[] args) {
	  int orange=127;
	  final int BOX=12;//상수
	  
	  int mok = orange/BOX;//몫
	  int nam = orange%BOX;//나머지
	  
	  System.out.println(mok+"박스, 나머지:"+nam);
		
	}
}
