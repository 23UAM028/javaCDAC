import java.util.Scanner;

public class MyDat {
    private int day;
    private int month;
    private int year;

    public MyDat() {
    }

    public MyDat(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day:");
        this.day = sc.nextInt();
        System.out.println("Enter Month:");
        this.month = sc.nextInt();
        System.out.println("Enter Year:");
        this.year = sc.nextInt();
    }

    

    public String toString() {
        return day + "/" + month + "/" + year;
    }

	public int getYear() {
		return 0;
	}
}
