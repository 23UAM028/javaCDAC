import java.util.Scanner;
public class String_Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter String");
	
		Scanner sc=new Scanner(System.in);
		
		String st=sc.nextLine(); 
		
		
		
		StringBuilder stb=new StringBuilder();
		stb.reverse();
		String s=stb.toString();
		
		if(s.equals(st))System.out.println("Give String is palindrom:");
		else System.out.println("Give String is not palindrom:");
		
		sc.close();
	}
	
}
	
//		boolean b=false;
//		
//		for(int i=0 , j=a.length-1;i<j;i++,j--) {
//			if(!(a[i]==a[j])) b=false;
//			else b=false;
//			
//		}
//		if(b) {
//			System.out.println("Give String is palindrom:"+st);
//		}
//		else {
//			System.out.println("Give String is not palindrom:"+st);
//		}
  	
//	}
//
//}
