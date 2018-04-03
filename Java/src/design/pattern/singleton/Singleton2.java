package design.pattern.singleton;

/**
 * 懒初始化：是
 * 多线程安全：否
 * 实现难度：简单
 * 建议使用：否
 * 描述：没有加锁，不支持多线程
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
