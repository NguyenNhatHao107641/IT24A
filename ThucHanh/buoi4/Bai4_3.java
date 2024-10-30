import java.util.Scanner;
public class Bai4_3
{
    public static void soLe(int n)
    {
        System.out.printf("Cac so le tu 1 den %d la: ",n);
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                System.out.printf("\t"+ i);

            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap gia tri n: ");
        int num = nhap.nextInt();
        soLe(num);        
    }
}

