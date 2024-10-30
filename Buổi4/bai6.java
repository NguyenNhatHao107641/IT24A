import java.util.Scanner;
public class bai6
{
    public static void soChan(int n)
    {
        System.out.printf("Cac so chan nho hon so %d la: ",n);
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
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
        soChan(num);        
    }
}
