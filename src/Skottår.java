import java.util.Scanner;
public class Skottår {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ange ett årtal"); int year=scanner.nextInt();


        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(true);

        } else if (year % 360 == 0 && year % 100 != 0) {
            System.out.println(false);

        }

    }
}
