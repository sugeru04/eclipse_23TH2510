package bai3_tinhBMI;
import java.util.Scanner;

public class tinhsBMI_23TH2510 {

	public static void main(String[] args) {
		// TODO tính chỉ số BMI
		Scanner banphim = new Scanner(System.in);
		// nhập họ tên
		System.out.print("họ tên:");
		String hoten = banphim.nextLine();
		// nhập chiều cao
		System.out.print("chiều cao(m):");
		double chieucao  = banphim.nextDouble();
		// nhập cân nặng
		System.out.print("cân nặng(kg) :");
		double cannang = banphim.nextDouble();
		// tính chỉ số BIM
		double bmi= cannang /(chieucao*chieucao);
		//in ra thông tin
		System.out.println("bạn "+ hoten);
		System.out.println("có chỉ số BIM ="+ bmi);
		if (bmi<18.5)
			System.out.println("thiếu cân");
		else if (bmi<25)
			System.out.println("cân nặng bình thường");
		else if (bmi<30)
			System.out.println("thừa cân ,tiền béo phì");
		else if (bmi<35)
			System.out.println("béo phì độ 1");
		else if (bmi<40)
			System.out.println("béo phì độ 2");
		else System.out.println("béo phì độ 3(bệnh lý)");
		

	}

}
