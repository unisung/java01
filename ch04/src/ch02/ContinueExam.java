package ch02;
//1부터 100사이의 정수 중에서 
//3또는 4의 배수가 아닌 수들의 합을 계산하는 -3배수도 아니고 4의 배수도 아닌수들
//프로그램을 작성하세요
public class ContinueExam {
	public static void main(String[] args) {
	   int sum=0;//지역변수 선언
	  for(int i=1;i<=100;i++) {
		  if(i%3==0 || i%4==0) continue;
		  sum+=i;//sum=sum+i;
	  }//반복문 끝.
	  System.out.println(sum);
	  

	}

}
