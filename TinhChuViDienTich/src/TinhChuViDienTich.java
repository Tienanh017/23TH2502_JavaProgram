import java.util.Scanner;

public class TinhChuViDienTich {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();

        // Tính chu vi và diện tích hình chữ nhật
        double chuViHCN = (dai + rong) * 2;
        double dienTichHCN = dai * rong;

        // Nhập bán kính của hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();

        // Tính chu vi và diện tích hình tròn
        double chuViHT = 2 * Math.PI * banKinh;
        double dienTichHT = Math.PI * Math.pow(banKinh, 2);

        // Xuất kết quả ra màn hình
        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuViHCN);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTichHCN);
        System.out.printf("Chu vi hình tròn: %.2f\n", chuViHT);
        System.out.printf("Diện tích hình tròn: %.2f\n", dienTichHT);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
