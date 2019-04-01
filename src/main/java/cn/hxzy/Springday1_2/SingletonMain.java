package cn.hxzy.Springday1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {
	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("spring.xml");
		Singleton s1=(Singleton) context.getBean("Singleton1");
		s1.getinstance();
		Singleton s2=(Singleton) context.getBean("Singleton1");
		s2.getinstance();
		if(s1 == s2){
			 System.out.println("同一个对象");
			 
		 }else{
			 System.out.println("不是同一个对象");
			 
		 }
	}
}
