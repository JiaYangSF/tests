package test.jia.v3;

public class UglyNumbers {
	public static void main(String[] args) {
		System.out.println(getUglyNumber(0));
		System.out.println(getUglyNumber(1));
		System.out.println(getUglyNumber(2));
		System.out.println(getUglyNumber(3));
		System.out.println(getUglyNumber(10));
	}

	// Given n, return nth ugly number

	public static boolean isUgly(int n) {
		if(n==1) return true;
		if(n==0) return false;
		int[] factors = { 2, 3, 5 };
		int i = 0;
		int result=n;
		while (i<3) {
			while(result % factors[i] == 0) {
				result = result / factors[i];
			}
			
			i++;
		}
		return result==1;
	}
	
	public static int getUglyNumber(int n) {
		int i=0; 
		while(i<100) {
			if(isUgly(n)) {
				return i;
			}
			i++;
		}
		return i;
	}	

	}












