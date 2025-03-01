import java.util.*;

class SanPham {
    String ten;
    Double donGia;
    
    public SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }
    
    @Override
    public String toString() {
        return "Tên: " + ten + ", Giá: " + donGia;
    }
}

public class ProductManager {
    private static ArrayList<SanPham> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất danh sách");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng
            
            switch (choice) {
                case 1: nhap(); break;
                case 2: sapXep(); break;
                case 3: xoa(); break;
                case 4: tinhGiaTrungBinh(); break;
                case 5: System.out.println("Chương trình kết thúc!"); return;
                default: System.out.println("Chọn sai, vui lòng nhập lại!");
            }
        }
    }
    
    private static void nhap() {
        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            Double gia = scanner.nextDouble();
            scanner.nextLine();
            list.add(new SanPham(ten, gia));
            
            System.out.print("Nhập thêm (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    private static void sapXep() {
        list.sort((o1, o2) -> o2.donGia.compareTo(o1.donGia));
        System.out.println("Danh sách sau khi sắp xếp giảm dần theo giá:");
        xuat();
    }
    
    private static void xuat() {
        for (SanPham sp : list) {
            System.out.println(sp);
        }
    }
    
    private static void xoa() {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        Iterator<SanPham> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().ten.equalsIgnoreCase(tenCanXoa)) {
                iterator.remove();
                System.out.println("Đã xóa sản phẩm: " + tenCanXoa);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần xóa.");
    }
    
    private static void tinhGiaTrungBinh() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống, không thể tính giá trung bình.");
            return;
        }
        double sum = 0;
        for (SanPham sp : list) {
            sum += sp.donGia;
        }
        System.out.println("Giá trung bình của các sản phẩm: " + (sum / list.size()));
    }
}
