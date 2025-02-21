import java.util.Scanner;
public class DiemHs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] names = new String[n];
        double[] scores = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            
            System.out.print("Nhập điểm của sinh viên " + names[i] + ": ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
        // Sắp xếp sinh viên theo điểm tăng dần (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    // Hoán đổi điểm
                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;
                    // Hoán đổi tên
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        // Xuất danh sách sinh viên
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + getAcademicPerformance(scores[i]));
            System.out.println("----------------------");
        }
        
        scanner.close();
    }
    public static String getAcademicPerformance(double score) {
        if (score < 5) return "Yếu";
        else if (score < 6.5) return "Trung bình";
        else if (score < 7.5) return "Khá";
        else if (score < 9) return "Giỏi";
        else return "Xuất sắc";
	}
}
