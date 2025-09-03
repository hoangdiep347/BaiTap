// tạo package
package JavaBasic_Baitap1;

// tạo class
public class SinhVien {
    // khai báo biến Instance - biến toàn cục
    String BienInstance = "Biến Instance";

    // khai báo biến Static - biến tĩnh
    public static String BienStatic = "Biến Static";

    public static void main(String[] args) {

        //khai báo biến Local - cục bộ
        String BienLocal = "Biến Local";

        //khai báo class SinhVien sv
        SinhVien sv = new SinhVien();

        //khai báo class ThongTin tt
        ThongTin tt = new ThongTin();

        // in  kết quả
        System.out.println("Đây là: " + BienLocal);
        System.out.println("Đây là: " + sv.BienInstance);
        System.out.println("Đây là: " + BienStatic);
        System.out.println("Đây là: " + tt.ClassThongTinBienStatic);

    }
}
