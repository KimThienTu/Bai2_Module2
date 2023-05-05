import java.util.Scanner;

public class TH_KTSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = sc.nextInt();

        if (number < 2){
            System.out.println(number + " Ko phải là SNT ");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " Là số nguyên tố ");
            else
                System.out.println(number + " Ko phải là SNT");
        }
    }
}
