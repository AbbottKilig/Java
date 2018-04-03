package design.pattern.singleton;

import java.io.ObjectInputStream.GetField;

/**
 * 懒初始化：否
 * 多线程安全：是
 * 实现难度：简单
 * 建议使用：否
 * 描述：加synchronize锁影响获取实例的效率
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
