package design.pattern.singleton;

/**
 * 懒初始化：是
 * 多线程安全：是
 * 实现难度：简单
 * 建议使用：是
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
