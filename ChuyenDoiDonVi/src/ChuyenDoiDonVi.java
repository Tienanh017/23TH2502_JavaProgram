import java.util.Scanner;

public class ChuyenDoiDonVi {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập khoảng cách tính bằng km
        System.out.print("Nhập khoảng cách (km): ");
        double km = scanner.nextDouble();

        // Chuyển đổi từ km sang mét (1 km = 1000 m)
        double met = km * 1000;

        // Nhập dung lượng tính bằng byte
        System.out.print("Nhập dung lượng (byte): ");
        double byteValue = scanner.nextDouble();

        // Chuyển đổi từ byte sang bit (1 byte = 8 bit)
        double bit = byteValue * 8;

        // Xuất kết quả ra màn hình
        System.out.printf("%.2f km = %.2f mét\n", km, met);
        System.out.printf("%.2f byte = %.2f bit\n", byteValue, bit);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
