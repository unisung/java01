package ch10.ch01;

public class Television {
	//static���
	static String company="samsong";
	static String model;
	static String info;
	static int seq;
    //�ν��Ͻ� �ɹ�
	String iInfo;
    
	//static�ʱ�ȭ
	static{
		model="UHD4K";
		info=company+model;
	}
	//������
	Television(){ 
		iInfo=info + ++seq;
	}
	@Override
	public String toString() {
		return "Television [iInfo=" + iInfo + "]";
	}
	
	
}
