import java.util.Scanner;
public class bai2 {
    public static void bai2Dem(int n){
        System.out.printf("Cac so tu 1 den %d la",n);
        for(int i=1;i<=n;i++){
            System.out.printf("\t"+ i);
        }
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap gia tri n: ");
        int num = nhap.nextInt();
        bai2Dem(num);
        
    }
}

