import java.util.Scanner;

public class SanPham {

	private String tenSp;
    private double donGia;
    private double giamGia;

    // Phương thức nhập thông tin sản phẩm
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
        scanner.close();
    }

    // Phương thức tính thuế nhập khẩu (10% đơn giá)
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Phương thức xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Thông tin sản phẩm:");
        System.out.printf("Tên sản phẩm: %s\n", tenSp);
        System.out.printf("Đơn giá: %.0f VND\n", donGia);
        System.out.printf("Giảm giá: %.0f VND\n", giamGia);
        System.out.printf("Thuế nhập khẩu: %.0f VND\n", getThueNhapKhau());
    }

    public static void main(String[] args) {
    	  SanPham sp1 = new SanPham();
          SanPham sp2 = new SanPham();
          
          System.out.println("Nhập thông tin sản phẩm 1:");
          sp1.nhap();
          
          System.out.println("Nhập thông tin sản phẩm 2:");
          sp2.nhap();
          
          System.out.println("\nThông tin sản phẩm 1:");
          sp1.xuat();
          
          System.out.println("\nThông tin sản phẩm 2:");
          sp2.xuat();
    }

}
