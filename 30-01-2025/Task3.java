package My_package;
import java.util.*;
public class Task3 {
	public static void main(String[] args) {
		int intArray1[] = {1, 2, 3};
		int intArray2[] = {1, 2, 3};
		Object[] arr1 = {intArray1};
		Object[] arr2 = {intArray2};
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Both are Equal Arrays");
		} else {
			System.out.println("Not Equals because of Objects");
		}
		if(Arrays.deepEquals(arr1, arr2)) {
			System.out.println("Both are Deep Equal Arrays");
		} else {
			System.out.println("Not Deep Equals");
		}

	}
}
