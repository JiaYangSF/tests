package test.jia.v3;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(getFibonacci(5));
	}
	
	static int total=0;
	static int n=10;
	private static int add(int first, int second) {
		total = first+second;
		return add(second, total);
	}
	
	private static int getFibonacci(int n) {
		int result=0;
		for (int i = 0; i < n; i++) {
			 result = add(i, i+1);
		}
		return result;
	}
	
}
