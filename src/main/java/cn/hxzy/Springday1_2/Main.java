package cn.hxzy.Springday1_2;

public class Main {
	public static void main(String[] args) {
		Singleton sa1 = Singleton.getinstance();
		Singleton sa2 = Singleton.getinstance();
		System.out.println(sa1 == sa2);

		SingletonLazy sl1 = SingletonLazy.getinstance();
		SingletonLazy sl2 = SingletonLazy.getinstance();
		System.out.println(sl1 == sl2);
	}
}
