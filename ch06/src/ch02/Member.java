package ch02;

public class Member {
	//�ܺγ��Ⱑ�� �Ӽ�-public ����������
	public String name;
	public String id;
	//�ܺγ���Ұ� �Ӽ�-private ����������
	private String pwd="1234";
	
	//this-Ŭ������ ���� ������ instance�� ����Ű�� �����
	public void setPwd(String pwd) {
		 this.pwd=pwd;
	}
	
	//�ܺο� ���Ⱑ�� �޼ҵ�-pubilc ����������
	public void getInfo(String grant) {
		if(Grant.valueOf(grant)==Grant.ADMIN) {
			System.out.println("�����:"+getPwd());
		}else {
			System.out.println(Grant.ADMIN.name()+"�� �ƴϸ� Ȯ�κҰ�");
		}
	}
	//�ܺο� ����Ұ� �޼ҵ�-private ����������
	private String getPwd() {
		return this.pwd;
	}
	
	

}
