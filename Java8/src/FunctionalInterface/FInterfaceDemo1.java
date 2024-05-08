package FunctionalInterface;


@FunctionalInterface
interface A
{
	void show();
}

public class FInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1= () -> System.out.println("show");
		a1.show();
		
	}

}
