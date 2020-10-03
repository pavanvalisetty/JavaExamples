package com.test;

public class AbstractEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.setValue(20);
		t.getValue();

		System.out.println("--------" + solution(10, 10));
	}

	// This is for Java solution
	// For test case , N 10 K 10 failing above code.I modified to get correct one.
	// Here is solution.
	public static int solution(int N, int K) {
		int result = 0;
		while (N >= 3 && K > 0) {
			if (N % 2 == 0) {
				N -= 1;
			} else {
				N /= 2;
				K -= 1;
			}
			result += 1;
		}
		return result + N - 1;
	}

	public static int solution1(int N, int K) {
		if (K < 1 || N < 4)
			return N - 1;

		return 1 + ((N % 2) ? solution(N - 1, K) : solution(N / 2, K - 1));
	}
}

abstract class EnumParent {

	public int a;

	abstract int getValue();

	abstract void setValue(int a);

}

class Test extends EnumParent {

	int getValue() {
		System.out.println(a);
		return a;

	}

	void setValue(int a) {
		this.a = a;
	}
}