package cn.hxzy.Springday1_2;
/*饿汉式
 *  单例模式 1）构造器私有,外部（其他类）无法创建该对象. 
 * 		2) 对外部，提供一个public static 的方法，用来返回 它自己
 * 		3) 是线程安全的.
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getinstance() {
		return instance;

	}
}
