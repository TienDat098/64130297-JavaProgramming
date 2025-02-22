import java.util.Scanner;

public class SanPham {
	   private String tenSp;
	    private double donGia;
	    private double giamGia;
	    // Hàm tạo với 3 tham số
	    public SanPham(String tenSp, double donGia, double giamGia) {
	        this.tenSp = tenSp;
	        this.donGia = donGia;
	        this.giamGia = giamGia;
	    }
	    // Hàm tạo với 2 tham số (không giảm giá)
	    public SanPham(String tenSp, double donGia) {
	        this(tenSp, donGia, 0);
	    }
	 // Getter và Setter cho các thuộc tính
	    public String getTenSp() {
	        return tenSp;
	    }

	    public void setTenSp(String tenSp) {
	        this.tenSp = tenSp;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }

	    public double getGiamGia() {
	        return giamGia;
	    }

	    public void setGiamGia(double giamGia) {
	        this.giamGia = giamGia;
	    }
	    private double getThueNhapKhau() {
	        return donGia * 0.1;
	    }
	    // Phương thức nhập thông tin sản phẩm từ bàn phím
	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên sản phẩm: ");
	        this.tenSp = scanner.nextLine();
	        System.out.print("Nhập đơn giá: ");
	        this.donGia = scanner.nextDouble();
	        System.out.print("Nhập giảm giá: ");
	        this.giamGia = scanner.nextDouble();
	        scanner.close();
	    }

	    // Phương thức xuất thông tin sản phẩm
	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + tenSp);
	        System.out.println("Đơn giá: " + (int) donGia + " VND");
	        System.out.println("Giảm giá: " + (int) giamGia + " VND");
	        System.out.println("Thuế nhập khẩu: " + (int) getThueNhapKhau() + " VND");
	    }

	    public static void main(String[] args) {
	        // Tạo sản phẩm có giảm giá
	        SanPham sp1 = new SanPham("Laptop", 15000000, 1000000);
	        // Tạo sản phẩm không có giảm giá
	        SanPham sp2 = new SanPham("Điện thoại", 10000000);

	        // Xuất thông tin hai sản phẩm
	        System.out.println("\nThông tin sản phẩm 1:");
	        sp1.xuat();
	        System.out.println("\nThông tin sản phẩm 2:");
	        sp2.xuat();
	    }

}
