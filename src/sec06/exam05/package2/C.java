package sec06.exam05.package2;

import sec06.exam05.package1.A;
public class C {
	public C() {
		A a = new A();
		
		a.field1=1;
		//a.field2=1; 컴파일에러 default 필드 접근 불가하다. 패키지가 다르기때문에
		//a.field3=1; 컴파일에러 private 필드 접근 불가하다.
		
		a.method1();
		//a.method2(); 컴파일에러 default 메소드 접근 불가하다. 패키지가 다르기때문에
		//a.method3(); 컴파일에러 private 메소드 접근 불가하다.
	}

}
