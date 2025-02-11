import java.util.Scanner;
public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập cạnh của khối lập phương: ");
	    double canh = scanner.nextDouble();
	    double theTich1 = canh * canh * canh; 
	    double theTich2 = Math.pow(canh, 3);   
	    System.out.printf("Thể tích của khối lập phương (cách 1): %.2f\n", theTich1);
	    System.out.printf("Thể tích của khối lập phương (cách 2): %.2f\n", theTich2);
	    scanner.close();
	}

}
