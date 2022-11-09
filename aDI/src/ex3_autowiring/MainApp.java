package ex3_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		// [1] 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3_autowiring/applicationContext.xml");
		
		MessageBean bean = context.getBean("message", MessageBean.class);
		bean.sayHello();
		
	}

}
