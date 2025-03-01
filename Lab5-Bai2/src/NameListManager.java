import java.util.*;

public class NameListManager {
    private static ArrayList<String> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: ngauNhien(); break;
                case 4: sapXep(); break;
                case 5: xoa(); break;
                case 6: System.out.println("Chương trình kết thúc!"); return;
                default: System.out.println("Chọn sai, vui lòng nhập lại!");
            }
        }
    }
    
    private static void nhap() {
        while (true) {
            System.out.print("Nhập họ và tên: ");
            String name = scanner.nextLine();
            list.add(name);
            System.out.print("Nhập thêm (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    private static void xuat() {
        System.out.println("Danh sách họ và tên:");
        for (String name : list) {
            System.out.println(name);
        }
    }
    private static void ngauNhien() {
        Collections.shuffle(list);
        System.out.println("Danh sách ngẫu nhiên:");
        xuat();
    }
    
    private static void sapXep() {
        list.sort(Collections.reverseOrder());
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        xuat();
    }
    
    private static void xoa() {
        System.out.print("Nhập họ tên cần xóa: ");
        String nameToDelete = scanner.nextLine();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(nameToDelete)) {
                iterator.remove();
                System.out.println("Đã xóa: " + nameToDelete);
                return;
            }
        }
        System.out.println("Không tìm thấy tên cần xóa.");
    }
}
  
