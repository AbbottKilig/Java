package design.pattern.singleton;

/**
 * 懒初始化：否
 * 多线程安全：是
 * 实现难度：简单
 * 建议使用：是
 * 描述：在内加载阶段初始化，浪费内存。避免了多线程同步问题
 */
public class Singleton1 {
	private static final Singleton1 singleton = new Singleton1();
	private Singleton1() {
		
	}
	
	public static Singleton1 getSingleton() {
		return singleton;
	}
	

}
