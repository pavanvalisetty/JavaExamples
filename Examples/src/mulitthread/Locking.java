package mulitthread;

public class Locking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable t1 = ()-> {
			m1();
		};
		Runnable t2 = () -> {
			m2();
		};

		new Thread(t1).start();
		new Thread(t2).start();

	}

	public static synchronized void m1() {
		System.out.println("m1");
	}

	public static synchronized void m2() {
		System.out.println("m2");
	}
}
