import java.util.Scanner;
public class Nhapxuathoten {

    public static void main(String[] args) {
        // Khai báo biến
        String hoTen;
        int tuoi;
        double chieuCao;
        double canNang;

        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner banPhim = new Scanner(System.in);

        // Nhập thông tin
        System.out.print("Nhập họ tên: ");
        hoTen = banPhim.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = banPhim.nextInt();

        System.out.print("Nhập chiều cao (m): ");
        chieuCao = banPhim.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        canNang = banPhim.nextDouble();

        // Hiển thị thông tin đã nhập
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Cân nặng: " + canNang + " kg");

        // Đóng đối tượng Scanner để giải phóng tài nguyên
        banPhim.close();
    }
}
