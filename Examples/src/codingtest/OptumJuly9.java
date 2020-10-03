package codingtest;

public class OptumJuly9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();

		B b2 = new C();
		//b2.m3();
		
	}

	@SuppressWarnings("finally")
	public int add() {
		try {
			// Some exception
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		} finally {
			// s.o.p("finally");
			return 3;

		}
	}
}

class A {

	public A() {
		System.out.println("I am in A");
	}

	static {
		System.out.println("I am in static block A");
	}

	public void m1() {
		System.out.println("m1");
	}
}

class B extends A {

	public B() {
		System.out.println("I am in B");
	}

	static {
		System.out.println("I am in static block B");
	}

	public void m2() {
		System.out.println("m2");
	}
}

class C extends B {

	public C() {
		System.out.println("I am in C");
	}

	public void m3() {
		System.out.println("m3");
	}

	static {
		System.out.println("I am in static block C");
	}
}
