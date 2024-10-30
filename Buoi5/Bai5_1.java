import java.util.Scanner;
public class Bai5_1
{
    public static int timGiaTriLonNhat(int a,int b){
        return a>b?a:b;
    }
    public static int timGiaTriNhoNhat(int a,int b){
        return a<b?a:b;
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap so a : ");
        int num1 = nhap.nextInt();
        System.out.printf("Nhap so b :  ");
        int num2 = nhap.nextInt();
        System.out.printf("So lon nhat trong hai so %d va %d la: %d \n",num1,num2,timGiaTriLonNhat(num1, num2));
        System.out.printf("So nho nhat trong hai so %d va %d la: %d ",num1,num2,timGiaTriNhoNhat(num1,num2));

    }
}
