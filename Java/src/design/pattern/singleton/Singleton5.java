package design.pattern.singleton;

/**
 * ����ʼ������
 * ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ����ʹ�ã���
 */
public class Singleton5 {
	private static class SingleObject{
		private static final Singleton5 singleton = new Singleton5();
	}
	private Singleton5() {
		
	}
	public static final Singleton5 getSingleton() {
		return SingleObject.singleton;
	}
}
