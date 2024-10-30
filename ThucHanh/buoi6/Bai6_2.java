import java.util.Scanner;
public class Bai6_2 {
    public static void tH1(){
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap ho va ten :");
        String hoTen = nhap.nextLine();
        System.out.printf("Nhap  ngay sinh :");
        String ngaySinh = nhap.nextLine();
        System.out.printf("Nhap diem tong ket :");
        String diemTongKet = nhap.nextLine();
        System.out.printf("Nhap tuoi :");
        String tuoi = nhap.nextLine();
        System.out.printf("-----THÔNG TIN SINH VIÊN-----\n");
        System.out.printf("Ho va ten : %s \n",hoTen);
        System.out.printf("Ngay sinh : %s\n",ngaySinh);
        System.out.printf("Diem tong ket : %s \n",Float.parseFloat(diemTongKet));
        System.out.printf("Tuoi : %s \n",Integer.parseInt(tuoi));
    }
    public static void tH2(){
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap ho va ten :");
        String hoTen = nhap.nextLine(); 
        System.out.printf("Nhap  ngay sinh :");
        String ngaySinh = nhap.nextLine(); 
        System.out.printf("Nhap diem tong ket :");
        Float diemTongKet = nhap.nextFloat();
        System.out.printf("Nhap tuoi :");
        int tuoi = nhap.nextInt();
        System.out.printf("-----THÔNG TIN SINH VIÊN-----\n");
        System.out.printf("Ho va ten : %s \n",hoTen);
        System.out.printf("Ngay sinh : %s\n",ngaySinh);
        System.out.printf("Diem tong ket : %s \n",Float.toString(diemTongKet));
        System.out.printf("Tuoi : %s \n",Integer.toString(tuoi));
    }
    public static void main(String[] args) {
        tH1();
        tH2();
    }
}
