import java.util.*;
import java.util.HashSet;
import java.util.Set;
class CompareTwoSets
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Set<String>h1=new HashSet();
		Set<String>h2=new HashSet();
		System.out.println("Enter size of set");
		int n=s.nextInt();
		System.out.println("Enter Elements in first set:");
		for(int i=0;i<n;i++)
		{
		     h1.add(s.next());
		}
		System.out.println("Enter Elements in second set:");
        for(int i=0;i<n;i++)
		{
			h2.add(s.next());
        }			
		h1.retainAll(h2);
		System.out.print("Elements retained are:"+h1);
	}
}