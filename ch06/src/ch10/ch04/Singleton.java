package ch10.ch04;
//singleton�� ������ ��ü�� �ϳ�. 
public class Singleton {
    private static Singleton instance=new Singleton();
    //�⺻ �����ڸ� �ܺο��� ���� ���ϵ��� private�� ĸ��ȭ
    //public Singleton(){}
    private Singleton() {}
    //��ü �ڽ��� �����ֱ����ؼ� public�������� getInstance()�޼ҵ带 ����
	public static Singleton getInstance() {
		return instance;
	}
    
    
    
}
