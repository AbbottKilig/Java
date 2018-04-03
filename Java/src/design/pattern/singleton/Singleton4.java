package design.pattern.singleton;

/**
 * 懒初始化：是
 * 多线程安全：是
 * 实现难度：中等
 * 建议使用：是
 * 描述：懒初始化，避免内存垃圾，双锁机制，安全且多线程下高性能
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
