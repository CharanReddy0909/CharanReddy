package practicePackage;


import java.util.Arrays;
import java.util.List;
public class Main
{
	public static void main(String[] args) {
		
		Integer[] a={1,2,3,4,5};
		List<Integer> l=Arrays.asList(a);
		int s=0;
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
		    s=s+l.get(i);
		}
		System.out.println(s/l.size());
		
	}
}