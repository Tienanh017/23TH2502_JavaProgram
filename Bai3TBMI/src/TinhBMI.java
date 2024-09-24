import java.util.Scanner;

public class TinhBMI {

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

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // Phân loại BMI
        String phanLoai;
        if (bmi < 18.5) {
            phanLoai = "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            phanLoai = "Bình thường";
        } else if (bmi >= 23.0 && bmi <= 24.9) {
            phanLoai = "Thừa cân";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            phanLoai = "Béo phì độ I";
        } else { // BMI > 30.0
            phanLoai = "Béo phì độ II";
        }

        // Hiển thị thông tin đã nhập và chỉ số BMI
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.printf("Chỉ số BMI: %.2f\n", bmi); 
        System.out.println("Phân loại BMI: " + phanLoai); 

        
        banPhim.close();
    }
}
