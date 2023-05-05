import java.util.Scanner;

public class TH_UDTinhTienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền gửi");
        money = input.nextDouble();

        System.out.println("Nhập số tháng gửi");
        month = input.nextInt();

        System.out.println("Nhập lãi suất");
        interestRate = input.nextDouble();

        double totalIntereset = 0;
        for (int i = 0; i < month; i++){
            totalIntereset += money * (interestRate/100)/12 * month;

        System.out.println("Tổng tiền lãi là: " + totalIntereset);
        }
    }
}
