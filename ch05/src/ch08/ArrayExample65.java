package ch08;

public class ArrayExample65 {
	public static void main(String[] args) {
	  String[][] strArray= {{"hong","1234","seoul"},
			                {"kim","1111","suwon"},
			                {"wang","3333","bucheon"}
			                };
	  //���� for���� �̿��Ͽ� ����غ�����.
      for(String[] str1:strArray) {
    	  int count=0;
    	  for(String s:str1) {
    		  System.out.print(s);
    		  if(count++!=str1.length-1)System.out.print(", ");
    	  }
    	  System.out.println();
      }

	}

}
