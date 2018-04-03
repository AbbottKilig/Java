package design.pattern.singleton;

import java.io.ObjectInputStream.GetField;

/**
 * ����ʼ������
 * ���̰߳�ȫ����
 * ʵ���Ѷȣ���
 * ����ʹ�ã���
 * ��������synchronize��Ӱ���ȡʵ����Ч��
 */
public class Singleton3 {
	private static Singleton3 singleton;
	private Singleton3() {
		
	}
	
	public static synchronized Singleton3 getSingleton() {
		if (singleton == null) {
			singleton = new Singleton3();
		}
		return singleton;
	}
}
