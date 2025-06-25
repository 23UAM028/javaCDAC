
public class maxnum {
	public static void main(String[] args) {
		int a=10,b=20,c=30,max;
		if(a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=c;
			}
		}
		else
		{
			if(b>c) {
				max=b;
			}
			else {
				max=c;
			}
		}
		System.out.println("the max number is :"+max);
	}

}
