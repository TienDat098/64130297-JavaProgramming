import java.util.ArrayList;
import java.util.Scanner;

public class ListSum {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double>list =new ArrayList<>();
		while(true) {
			System.out.print("Nhập số thực:");
			Double x=scanner.nextDouble();
			list.add(x);
			 System.out.print("Nhập thêm (Y/N)? ");
	            scanner.nextLine(); 
	            String choice = scanner.nextLine();
	            if (choice.equalsIgnoreCase("N")) {
	                break;
	            }
		}
		System.out.println("Danh sách số thực vừa nhập:");
        double sum = 0;
        for (Double num : list) {
            System.out.println(num);
            sum += num;
        }
        
        System.out.println("Tổng các số trong danh sách: " + sum);
        scanner.close();
		
	}

}
