package design.pattern.singleton;

/**
 * ����ʼ������
 * ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ����ʹ�ã���
 * ���������ڼ��ؽ׶γ�ʼ�����˷��ڴ档�����˶��߳�ͬ������
 */
public class Singleton1 {
	private static final Singleton1 singleton = new Singleton1();
	private Singleton1() {
		
	}
	
	public static Singleton1 getSingleton() {
		return singleton;
	}
	

}
