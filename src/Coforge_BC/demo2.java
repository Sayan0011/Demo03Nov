package Coforge_BC;

public class demo2 {
	
	public static void main(String[] args) {
		System.out.println("I am a GET");
		fun1("Sayan");
		fun1();
		fun1(22);
	}
	
	public static void fun1() {
		System.out.println("I have Joined on 22 june");
	}

	public static void fun1(String name) {
		System.out.println("Hello Coforge! " + "my name is " + name);
	}
	public static void fun1(int age) {
		System.out.println("Hello Coforge! " + "my age is " + age);
	}

	
}
