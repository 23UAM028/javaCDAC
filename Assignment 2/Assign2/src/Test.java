
public class Test {

	public static void main(String[] args) {
		Invoice in1 = new Invoice("12345","Hammer",10,500);
	    
		System.out.println("Part number : "+ in1.getp());
		System.out.println("Part Descr. : "+ in1.getd());
		System.out.println("Quantity : "+ in1.getn());
		System.out.println("Price : "+ in1.getpr());

	}

}
