package cn.hxzy.Springday1_2;
/*
 * 懒汉式
 */
public class SingletonLazy {
	private static SingletonLazy singleton;
	private SingletonLazy(){
		
	}
	 synchronized public static SingletonLazy getinstance(){
		if(singleton==null){
			singleton=new SingletonLazy();
		}
		return singleton;
	}
	
}
