package ch03;
// ������ | ��  ||  : ||�� ������ ���̸� ������ ������� ������ �� 
// ������ & ��  &&  : &&�� ������ �����̸� ������ ������� ������ ����
public class CompareOperatorExample3 {
	public static void main(String[] args) {
	  int x=1,y=-1;
	  
	  //������ false �̸� ���ʸ� ���ó�� 
	  if(((x++)==2) && (x/(++y)==1)) {//false && ?
		  System.out.println("result");
	  }
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(x/y);
	  
	  //������ true �̸� ���ʸ� ���ó��
	  if((x==2) || (x/++y)==1) {//true || ? 
		  System.out.println("result2");
	  }

	  System.out.println(x);
	  System.out.println(y);
	}

}
