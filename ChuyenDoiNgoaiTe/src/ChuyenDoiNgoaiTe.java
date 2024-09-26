import java.util.Scanner;

public class ChuyenDoiNgoaiTe {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền VND từ bàn phím
        System.out.print("Nhập số tiền (VND): ");
        double vnd = scanner.nextDouble();

        // Tỷ giá hiện tại (có thể thay đổi tùy theo thời điểm thực tế)
        double tiGiaUSD = 24600;  // Ví dụ: 1 USD = 24,000 VND
        double tiGiaCNY = 3500;   // Ví dụ: 1 CNY = 3,300 VND

        // Chuyển đổi từ VND sang USD và CNY
        double usd = vnd / tiGiaUSD;
        double cny = vnd / tiGiaCNY;

        // Xuất kết quả ra màn hình
        System.out.printf("%.2f VND = %.2f USD\n", vnd, usd);
        System.out.printf("%.2f VND = %.2f CNY\n", vnd, cny);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
