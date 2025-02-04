package practicePackage;
public class Generics_1 {

	public static <T> boolean compareArrays(T[] a1,T[] a2)
	{
		
		if(a1.length!=a1.length)
		{
			return false;
		}
		for(int i=0;i<a1.length;i++)
		{
			if(!a1[i].equals(a2[i]))
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a1= {1,2,3,4,5};
		Integer[] a2= {1,2,3,4,5};
		System.out.println(compareArrays(a1, a2));

	}

}
