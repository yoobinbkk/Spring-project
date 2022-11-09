package aop1_xml;

public class MessageBeanImpl implements MessageBean {
	public void sayHello() {
		System.out.println("sayHello 출력");
	}
	public void enSayHello() {
		System.out.println("hello");
	}
	public void koSayHello() {
		System.out.println("안녕하세요");
	}
}
