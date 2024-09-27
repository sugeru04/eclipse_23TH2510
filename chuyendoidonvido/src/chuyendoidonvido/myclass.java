package chuyendoidonvido;

import java.util.Scanner;

public class myclass{
    public static double kmToM(double km) {
        if (km < 0) {
            throw new IllegalArgumentException("Giá trị km phải không âm");
        }
        return km * 1000;
    }

    public static int byteToBit(int byteSo) {
        if (byteSo < 0) {
            throw new IllegalArgumentException("Giá trị byte phải không âm");
        }
        return byteSo * 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số km: ");
        double km = scanner.nextDouble();
        System.out.print("Nhập số byte: ");
        int byteSo = scanner.nextInt();

        try {
            double m = kmToM(km);
            int bitSo = byteToBit(byteSo);
            System.out.println(km + " km tương đương " + m + " m");
            System.out.println(byteSo + " byte tương đương " + bitSo + " bit");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    //test
}