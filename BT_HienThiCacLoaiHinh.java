import java.util.Scanner;

public class BT_HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choida = -1;
        Scanner input = new Scanner(System.in);
        while (choida != 0){
            System.out.println("MeNu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choida = input.nextInt();

        switch (choida){
            case 1:
                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 7; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 1; i <= 7; i++){
                    for (int j = 1; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 7; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 0:
                System.exit(0);

            default:
                System.out.println("No choida");
        }
        }
    }
}
