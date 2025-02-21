import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của mảng:");
		int n=scanner.nextInt();
		int [] a=new int[n];
		System.out.print("Nhập các phần tử của mảng:");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
			//Sắp xếp mảng
			Arrays.sort(a);
			System.out.println("Mảng sau khi sắp xếp:"+Arrays.toString(a));
			//Tìm phần tử nhỏ nhất
			 int min = a[0];
		        System.out.println("Phần tử nhỏ nhất: " + min);
		        
		        // Tính trung bình cộng các số chia hết cho 3
		        int sum = 0, count = 0;
		        for (int num : a) {
		            if (num % 3 == 0) {
		                sum += num;
		                count++;
		            }
		        }
		        
		        if (count > 0) {
		            double avg = (double) sum / count;
		            System.out.println("Trung bình cộng các số chia hết cho 3: " + avg);
		        } else {
		            System.out.println("Không có số nào chia hết cho 3 trong mảng.");
		        }
		        
		        scanner.close();
	}

}
