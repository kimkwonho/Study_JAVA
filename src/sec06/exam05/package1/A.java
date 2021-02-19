package sec06.exam05.package1;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;
	//생성자
	public A() {
		field1=1;
		field2=1;
		field3=1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	/* A클래스 내부에서는 접근 제한과는 상관없이 필드와 메소드 모두 사용 가능하다. */
	
	

}
