package verify;
//7.주어진 배열의 항목에서 최대값을 구해보세요(for)
public class Exercise07 {
	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};//길이가 5인 1차원 배열
		
		for(int i=0;i<array.length;i++) {
			System.out.print("max:"+max+"\t");
			System.out.print("array[i]:"+array[i]+"\t");
			if(max<array[i]) max=array[i];
			System.out.println("max:"+max+"\t"+"array[i]:"+array[i]);
		}
		
		System.out.println("max:"+max);

	}

}
