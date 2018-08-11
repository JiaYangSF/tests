package test.jia;

/**
 * Hello world!
 *
 */
public class Runner<T>
{
    public static void main( String[] args )
    {  generateRandomArray(20);
       showArray(generateRandomArray(20));
    }

	private static <T> void showArray(T[] list) {
		for(T t:list) {
			System.out.print(t+" ");
		}
		System.out.println();
		
	}
	
	private static <T> Integer[] generateRandomArray(int size) {
		Integer[] ar1 = new Integer[size];
		for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random() * 100);
            System.out.print(ar1[i] + " ");
        }
		System.out.println();
		return ar1;
		
	}
	
	
}
