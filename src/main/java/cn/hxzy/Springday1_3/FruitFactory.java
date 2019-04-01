package cn.hxzy.Springday1_3;

public class FruitFactory {
	public static Fruit getFruit(String param) {
		if (param.equals("apple")) {
			return new Apple();
		} else if (param.equals("pear")) {
			return new Pear();
		} else {
			return null;

		}

	}

}
