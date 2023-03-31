package De_02;
import java.util.*;

class AlbumCD {
    String maSoAlbum;
    String tenAlbum;
    int soLuongCD;
    double giaNiemYet;
    double thanhTien;
    double giamGia;
    double phaiTra;

    public AlbumCD(String maSoAlbum, String tenAlbum, int soLuongCD, double giaNiemYet) {
        this.maSoAlbum = maSoAlbum;
        this.tenAlbum = tenAlbum;
        this.soLuongCD = soLuongCD;
        this.giaNiemYet = giaNiemYet;

        // Tính toán các giá trị khác
        this.thanhTien = soLuongCD * giaNiemYet;
        if (soLuongCD < 20) {
            this.giamGia = 0;
        } else if (soLuongCD < 50) {
            this.giamGia = this.thanhTien * 0.05;
        } else if (soLuongCD < 100) {
            this.giamGia = this.thanhTien * 0.1;
        } else {
            this.giamGia = this.thanhTien * 0.2;
        }
        this.phaiTra = this.thanhTien - this.giamGia;
    }

    public String toString() {
        return String.format("%s\t%s\t%d\t%.2f\t%.2f\t%.2f\t%.2f", 
            maSoAlbum, tenAlbum, soLuongCD, giaNiemYet, thanhTien, giamGia, phaiTra);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng AlbumCD
        System.out.print("Nhap so luong AlbumCD: ");
        int n = sc.nextInt();

        // Nhập thông tin cho từng AlbumCD và lưu vào danh sách
        ArrayList<AlbumCD> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap thong tin cho AlbumCD thu %d:\n", i + 1);
            System.out.print("Ma so album: ");
            String maSoAlbum = sc.next();
            System.out.print("Ten album: ");
            String tenAlbum = sc.next();
            System.out.print("So luong CD: ");
            int soLuongCD = sc.nextInt();
            System.out.print("Gia niem yet: ");
            double giaNiemYet = sc.nextDouble();

            AlbumCD album = new AlbumCD(maSoAlbum, tenAlbum, soLuongCD, giaNiemYet);
            danhSach.add(album);
        }

        // In ra danh sách AlbumCD vừa nhập
        System.out.println("Danh sach AlbumCD vua nhap:");
        System.out.println("Ma so\tTen album\tSo luong CD\tGia niem yet\tThanh tien\tGiam gia\tPhai tra");
        for (AlbumCD album : danhSach) {
            System.out.println(album);
        }

        // Tìm AlbumCD bán ế
        AlbumCD banE = danhSach.get(0);
        for (AlbumCD album : danhSach) {
            if (album.soLuongCD < banE.soLuongCD) {
                banE = album;
            }
        }
        System.out.printf("Dia CD ban e: %s - %s (so luong: %d)\n", banE.maSoAlbum, banE.tenAlbum, banE.soLuongCD);

        // Sắp xếp danh sách tăng dần theo mức phải trả
        Collections.sort(danhSach, new Comparator<AlbumCD>() {
            public int compare(AlbumCD a1, AlbumCD a2) {
                if (a1.phaiTra < a2.phaiTra) {
                    return -1;
                } else if (a1.phaiTra > a2.phaiTra) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // In ra danh sách AlbumCD sau khi sắp xếp
        System.out.println("Danh sach AlbumCD sau khi sap xep theo muc phai tra:");
        System.out.println("Ma so\tTen album\tSo luong CD\tGia niem yet\tThanh tien\tGiam gia\tPhai tra");
        for (AlbumCD album : danhSach) {
            System.out.println(album);
        }
    }}


