import java.util.Arrays;

public class copypaste {
public static void main(String[] args) {
	
	
		int[] a = { 10, 20, 30 };
		int[] b = { 100, 200, 300 };
		// Merge the two arrays with for-loops.
		int[] merge = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
		merge[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
		merge[i + a.length] = b[i];
		}
		// Display the merged array.
		System.out.println(Arrays.toString(merge));
	
	
	
}
}
