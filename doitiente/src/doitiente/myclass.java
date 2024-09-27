package doitiente;

import java.util.Scanner;

public class myclass  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tỷ giá cứng mã hóa (USD -> VND)
        double tyGiaUSDVND = 25000;

        System.out.print("Nhập số tiền USD: ");
        double soTienUSD = scanner.nextDouble();

        double soTienVND = soTienUSD * tyGiaUSDVND;

        System.out.println(soTienUSD + " USD tương đương " + soTienVND + " VND");
    }
}
