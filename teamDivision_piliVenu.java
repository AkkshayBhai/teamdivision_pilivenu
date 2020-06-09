import java.io.*;
import java.util.Scanner;

class myCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
        String[] arr = inputString.split(",");
        int[] a = new int[arr.length];
      double s = 0, s1 = 0, s2 = 0;  
      for(int i = 0; i <arr.length; i++){
          a[i] = Integer.valueOf(arr[i]);
        s+=a[i];
        }
		int[] a1 = new int[a.length/2];
        int[] a2 = new int[a.length/2];
        if(s/2 == (int)s/2){
          s1 = s/2;
          s2 = s/2;
        }else{
          s1 = (int)s/2;
          s2 = (int)(s+1)/2;
        }
       System.out.println((int)s1+" "+(int)s2);
      
        
		
        
	}
}
