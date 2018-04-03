package design.pattern.singleton;

/**
 * ����ʼ������
 * ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ����ʹ�ã���
 * ������û�м�������֧�ֶ��߳�
 */
public class Singleton2 {
	private static Singleton2 singleton;
	private Singleton2() {
		
	}
	public static Singleton2 getSingleton() {
		if (singleton == null) {
			singleton = new Singleton2();
		}
		return singleton;
	}

}
