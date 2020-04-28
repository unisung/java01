package ch03;
//byte타입 값의 오버플로우
public class ByteExam3 {
	public static void main(String[] args) {
		byte var1 = 125;//-128~127
		int var2 = 125;// -2^31 ~2^31-1 
		
		//for(초기값; 끝값 ; 증가) 
		for(int i=0;i<5;i++) {//초기값 0, 끝값 4, 1씩증가
			var1++;//++ 증가연산 1씩 증가
			var2++;//++ 증가연산 1씩 증가
			System.out.println("var1:"+var1+"\t"+"var2:"+var2);
		}
	}
}
