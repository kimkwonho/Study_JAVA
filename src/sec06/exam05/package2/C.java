package sec06.exam05.package2;

import sec06.exam05.package1.A;
public class C {
	public C() {
		A a = new A();
		
		a.field1=1;
		//a.field2=1; �����Ͽ��� default �ʵ� ���� �Ұ��ϴ�. ��Ű���� �ٸ��⶧����
		//a.field3=1; �����Ͽ��� private �ʵ� ���� �Ұ��ϴ�.
		
		a.method1();
		//a.method2(); �����Ͽ��� default �޼ҵ� ���� �Ұ��ϴ�. ��Ű���� �ٸ��⶧����
		//a.method3(); �����Ͽ��� private �޼ҵ� ���� �Ұ��ϴ�.
	}

}
