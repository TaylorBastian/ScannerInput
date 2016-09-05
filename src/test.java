import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double f;
		Scanner t=new Scanner(System.in);
		System.out.println("Area?");
		f=t.nextFloat();
		System.out.println("The radius of the circle is: "+ Math.sqrt(f/Math.PI));
		
	}

}
