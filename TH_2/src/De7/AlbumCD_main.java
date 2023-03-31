package De7;
//191724-Chăng Nguyễn Hiếu Nghĩa

import java.util.Scanner;
import java.util.*;

public class AlbumCD_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng hoá đơn: ");
        int n = scanner.nextInt();

        List<AlbumCD> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin hoá đơn thứ " + (i + 1) + ":");
            AlbumCD cd = new AlbumCD();
            cd.nhapThongTin();
            list.add(cd);
        }

      
        System.out.println("Danh sách hoá đơn bán CD:");
        for (AlbumCD cd : list) {
            cd.inThongTin();
        }

        AlbumCD maxDiscountCD = list.get(0);
        for (AlbumCD cd : list) {
            if (cd.tinhGiamGia() > maxDiscountCD.tinhGiamGia()) {
                maxDiscountCD = cd;
            }
        }
        System.out.println("Hoá đơn có giảm giá nhiều nhất:");
        maxDiscountCD.inThongTin();

     
        Collections.sort(list, new Comparator<AlbumCD>() {
            @Override
            public int compare(AlbumCD cd1, AlbumCD cd2) {
                return (int) (cd1.tinhPhaiTra() - cd2.tinhPhaiTra());
            }
        });
        System.out.println("Danh sách hoá đơn có mức tiền phải trả tăng dần:");
        for (AlbumCD cd : list) {
            cd.inThongTin();
        }
    }
}
//191724-Chăng Nguyễn Hiếu Nghĩa
