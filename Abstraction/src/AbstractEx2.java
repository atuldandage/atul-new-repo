
public class AbstractEx2 extends AbstractEx1{

public  void display2() {
		
		System.out.println("i am override");
		
	}
public void m2() {
	System.out.println("hii");
}
	public static void main(String[] args) {
		
		AbstractEx2 rr=new AbstractEx2();
		rr.display1();
		rr.display2();
		
	}
}
