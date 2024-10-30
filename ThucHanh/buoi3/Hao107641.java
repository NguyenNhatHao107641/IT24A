package ThucHanh.buoi3;
import java.util.Scanner;;
public class Hao107641 {
    public static String gioiTinh (boolean gT){
        return gT?"Nam":"Nu";
    }
    public static void bai3_1(){
        int mSV=107641,tuoi=18;
        String hoVaTen = "Nguyen Nhat Hao",ngaySinh = "29/08/2006",lop="IT24A",khoa="Công nghệ thông tin",diaChi="Cẩm Lệ, Đà Nắng";
        boolean gT = true;
        System.out.println("--------THÔNG TIN SINH VIÊN)--------");
        System.out.println("Mã sinh viên :"+mSV);
        System.out.println("Họ và tên :"+hoVaTen);
        System.out.println("Ngày sinh :"+ngaySinh);
        System.out.println("Tuổi :"+tuoi);
        System.out.println("Giới tính: "+gioiTinh(gT));
        System.out.println(" Lớp :"+lop);
        System.out.println("Khoa : "+khoa);
        System.out.println("Dia Chi :"+diaChi);
    }
    public static void bai3_2(){
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhập mã sinh viên: \n");
        int mSV = nhap.nextInt();
        System.out.printf("Nhập họ và têN: \n");
        String hoVaTen = nhap.nextLine();
        System.out.printf("Nhập ngày sinh: \n");
        String ngaySinh = nhap.nextLine();
        System.out.printf("Nhập tuổi: \n");
        int tuoi = nhap.nextInt();
        System.out.printf("Nhập giới tính: \n");
        String gT = nhap.nextLine();
        System.out.printf("Nhập lớp: \n");
        String lop = nhap.nextLine();
        System.out.printf("Nhập Khoa: \n");
        String khoa = nhap.nextLine();
        System.out.printf("Nhập địa chỉ: \n");
        String diaChi = nhap.nextLine();
        System.out.println("--------THÔNG TIN SINH VIÊN)--------");
        System.out.println("Mã sinh viên :"+mSV);
        System.out.println("Họ và tên :"+hoVaTen);
        System.out.println("Ngày sinh :"+ngaySinh);
        System.out.println("Tuổi :"+tuoi);
        System.out.println("Giới tính: "+gT);
        System.out.println(" Lớp :"+lop);
        System.out.println("Khoa : "+khoa);
        System.out.println("Dia Chi :"+diaChi);

    }
    public static void main(String[] args) {
        bai3_1();
        bai3_2();
    }
}
