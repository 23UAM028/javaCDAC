
interface A{
	void f1();
	void f3();
}
interface B{
	void f2();
	void f4();
}
class C implements  A, B{
	@Override
	public void f1(){
		System.out.println("c.f1");
		
	}
	@Override
	public void f3(){
		System.out.println("c.f3");
	}
	@Override
	public void f2(){
		System.out.println("c.f2");
	}	
	@Override
	public void f4(){
		System.out.println("c.f4");
	}
}
public class Program2{

    public static void main(String[] args) {
    	
    	A a= new C();
    	a.f1();
    	a.f3();
    	B b=new C();
    	b.f2();
    	b.f4();
    	
    	
    	
    }	
 }