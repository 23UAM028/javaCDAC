import java.util.Scanner;

public class Convergen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt(); 


        System.out.println("Given Number :" + number);
        
        System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
        
        System.out.println("Octal equivalent :" + Integer.toOctalString(number));
        
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number).toUpperCase());

        sc.close(); 
    }
}
