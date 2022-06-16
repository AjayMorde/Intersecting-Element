package welcomeToJava;
import java.util.*;

public class IntersectingArrays {
	 public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
	        // Your code here
	        int count =0;
	        Arrays.sort(a);
	        
	        System.out.println("The Intersection Elements are");
	        for(int i=0;i<n;i++)
	        {
	            if( a[i]==a[i-1])
	            {
	                continue;
	            }
	            for(int j=0;j<m;j++)
	            {
	                if(a[i]==b[j])
	                {
	                    count++;
	                    break;
	                }
	            }
	        }
	        return count;
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Array Length");
		int n=sc.nextInt();
		System.out.println("Enter Second Array Length");
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		System.out.println("Enter first Arrays elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter first Arrays elements");
		
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		
		 	 
		
		int ans=NumberofElementsInIntersection(a,b,m,n);
		System.out.println(ans);
	}

}
