import java.util.Scanner;
public class Rverse_String {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter String");
		
		String st=sc.nextLine();
		
		StringBuilder stb=new StringBuilder(st);
		
		stb.reverse();
		
		String s=stb.toString();
		
		
		System.out.println("revrese String:\n"+s);
		
		sc.close();
	}
}
//		for(int i=0 , j=r.length-1;i<j;i++,j--) {
//			char temp=r[i];
//			r[i]=r[j];
//			r[j]= temp;
//			
//		}
//		System.out.println("Enter string:");
//		for(int i=0;i<r.length;i++) {
//			System.out.print(r[i]);
//		}
//
//	}
//
//}
