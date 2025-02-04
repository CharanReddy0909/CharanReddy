package practicePackage;



public class Generics_2 {

	public static <T extends Number> void sumOfEvenOdd(T[] a1)
	{
		int odd=0;
		int even =0;
		for(T element :a1)
		{
			int value = element.intValue();
			if(value%2==0)
			{
				even=even+value;
			}
			else
			{
				odd=odd+value;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {1,2,3,4,5};
		sumOfEvenOdd(a);

	}

}
