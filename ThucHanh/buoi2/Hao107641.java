package ThucHanh.buoi2;
import java.util.Scanner;
public class Hao107641 {
    public static void main(String[] args) {
        System.out.printf("Xin chào các bạn tân sinh viên lớp IT24A\n ");
        System.out.printf("Xin chào các bạn tân sinh viên \" tên lớp\"\n");
        System.out.println("Giá trị của num1 là 10");
        System.out.println("Giá trị của num2 là 5.5");
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap ten lop: ");
        String lop = nhap.nextLine();
        System.out.println("Xin chào các bạn tân sinh viên \n lớp "+lop);
        System.out.printf("Nhap stt: ");
        String stt = nhap.nextLine();
        System.out.printf("Nhap ho va ten : ");
        String  ten = nhap.nextLine();
        System.out.printf("STT: %s HỌ VÀ TÊN %s LỚP %s",stt,ten,lop);
    }
    

}
