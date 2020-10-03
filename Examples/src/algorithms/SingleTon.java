package com.test.patterns;

class Singleton {

	private static volatile Singleton myInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (myInstance == null) {

			synchronized (Singleton.class) {

				if (myInstance == null) {

					// parallel
					myInstance = new Singleton();
				}

			}
			// thread local memory 
		}
		return myInstance;
	}

}

class A {

	void test() {

		Singleton.getInstance(); 
		
		
	}
}

T 1,T2
