public class Bai6_1
{
    public static void tH1()
    {
        String hoTen = "Nguyễn Văn An";
        String ngaySinh = "20/10/2006";
        String diemTongKet = "5.5";
        String tuoi = "18";
        System.out.printf("-----THÔNG TIN SINH VIÊN-----\n");
        System.out.printf("Ho va ten : %s \n",hoTen);
        System.out.printf("Ngay sinh : %s\n",ngaySinh);
        System.out.printf("Diem tong ket : %s \n",Float.parseFloat(diemTongKet));
        System.out.printf("Tuoi : %s \n",Integer.parseInt(tuoi));
    }
    public static void tH2()
    {
        String hoTen = "Nguyễn Văn An";
        String ngaySinh = "20/10/2006";
        Float diemTongKet = 5.5f;
        int tuoi = 18;
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

