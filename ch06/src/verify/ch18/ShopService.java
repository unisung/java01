package verify.ch18;
//�̱���
//�ڽ�Ÿ���� instance�ʵ� ���� �� �ʱ�ȭ, ���������ڴ� private
//�⺻ �����ڴ� private�� ����
//�ڽ�Ÿ���� ��ü instance�� �����Ҽ� �ִ� public���������� getInstance()�� ����
public class ShopService {
	private static ShopService instance=new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}
	
}
