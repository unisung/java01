package ch02;
//for(초기값;비교조건;증감){실행문;}
public class ForExample2 {
	public static void main(String[] args) {
	  //1~100까지의 정수를 합한결과를 출력
	  int sum=0;//합한결과를 저장할 변수  선언,초기화
	  
	  int i=1;
	  for( ;i<=100; ) {
		   sum=sum+i;
		   i++;
	  }
	  System.out.println("1부터100까지의 정수의 합:"+sum);

	}

}
