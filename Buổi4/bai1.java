public class bt1 
{
    public static void bai1_1()
    {
        int arr[] = { 3, 5, 8, 10, 14, 25 };
        System.out.printf(" Danh sách phần tử của mảng arr là: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.printf(" arr[%d] = %d", i, arr[i]);
        }
    }
    public static void bai1_2()
    {
        String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };
        System.out.printf("\nDanh sách phần tử của mảng nguHanh là: ");
        for (int i = 0; i < nguHanh.length; i++) 
        {
            System.out.printf("\nnguHanh[%d] = %s", i, nguHanh[i]);
        }
    }
    public static void bai1_3()
    {
        int arr1[][] = new int[2][3];
        System.out.println("\nDanh sách phần tử của mảng arr1 là: ");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                System.out.printf("arr1[%d][%d] =%d  ",i,j,arr1[i][j]);
            }
            System.out.println();
        }
    }
    public static void bai1_4()
    {
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println("\nDanh sach cac phan tu cua mang arr2 la: ");
        for(int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++){
                    System.out.printf("arr2[%d][%d] = %d\n",i,j,arr2[i][j]);
            }
        }
    }
    public static void main(String[] args) 
    {
        bai1_1();
        bai1_2();
        bai1_3();
        bai1_4();
    }
    
}

