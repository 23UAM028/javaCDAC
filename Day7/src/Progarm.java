
interface printable {
	int number=10;
	void print();
}
class Test implements printable{
	@Override
	public void print(){
		
	
	System.out.println("number"+printable.number);
	
	
}

}
public class Progarm{

    public static void main(String[] args) {
    	
    	
    	printable p= new Test();
    	p.print();
    }
}