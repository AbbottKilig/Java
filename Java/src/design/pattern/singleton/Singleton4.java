package design.pattern.singleton;

/**
 * ����ʼ������
 * ���̰߳�ȫ����
 * ʵ���Ѷȣ��е�
 * ����ʹ�ã���
 * ����������ʼ���������ڴ�������˫�����ƣ���ȫ�Ҷ��߳��¸�����
 */
public class Singleton4 {
	private volatile static Singleton4 singleton;
	private Singleton4() {
		
	}
	private static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
