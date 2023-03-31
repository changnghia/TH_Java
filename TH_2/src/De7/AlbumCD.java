package De7;
//191724-Chăng Nguyễn Hiếu Nghĩa
import java.util.Scanner;

public class AlbumCD {
    private String maCD;
    private String tenCD;
    private int soLuongCD;
    private double giaNiemYet;

    
    public AlbumCD() {
        maCD = "";
        tenCD = "";
        soLuongCD = 0;
        giaNiemYet = 0.0;
    }


    public AlbumCD(String maCD, String tenCD, int soLuongCD, double giaNiemYet) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.soLuongCD = soLuongCD;
        this.giaNiemYet = giaNiemYet;
    }


    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public int getSoLuongCD() {
        return soLuongCD;
    }

    public void setSoLuongCD(int soLuongCD) {
        this.soLuongCD = soLuongCD;
    }

    public double getGiaNiemYet() {
        return giaNiemYet;
    }

    public void setGiaNiemYet(double giaNiemYet) {
        this.giaNiemYet = giaNiemYet;
    }


    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã CD: ");
        maCD = scanner.nextLine();

        System.out.print("Nhập tên CD: ");
        tenCD = scanner.nextLine();

        System.out.print("Nhập số lượng CD: ");
        soLuongCD = scanner.nextInt();

        System.out.print("Nhập giá niêm yết: ");
        giaNiemYet = scanner.nextDouble();
    }


    public double tinhGiamGia() {
        if (soLuongCD < 20) {
            return 0.0;
        } else if (soLuongCD < 50) {
            return giaNiemYet * soLuongCD * 0.05;
        } else if (soLuongCD < 100) {
            return giaNiemYet * soLuongCD * 0.1;
        } else {
            return giaNiemYet * soLuongCD * 0.2;
        }
    }


    public double tinhThanhTien() {
        return giaNiemYet * soLuongCD;
    }


    public double tinhPhaiTra() {
        return tinhThanhTien() - tinhGiamGia();
    }

    
    public void inThongTin() {
    	 double giamGia = tinhGiamGia();
         double thanhTien = tinhThanhTien();
         double phaitra = tinhPhaiTra();
        System.out.println("Mã CD: " + maCD);
        System.out.println("Tên CD: " + tenCD);
        System.out.println("Giá niêm yết: " + giaNiemYet);
        System.out.println("Số lượng CD: " + soLuongCD);
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Phải trả: " + phaitra);
    }
}
//191724-Chăng Nguyễn Hiếu Nghĩa
