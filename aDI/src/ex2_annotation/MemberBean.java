package ex2_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
	
	private String name = "홍길동";
	private int age = 33;
	private String message = "아자아자";
	
	//-------------------
	public void output() {
		System.out.println(name + "[" + age + "]" + message);
	}
	
//	// 1. constructor 이용
//	public MemberBean() {System.out.println("기본생성자");}
//	public MemberBean(String name, int age, String message) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.message = message;
//	}
//	
//	
//	// 2. setter, getter 이용
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	
	
}
