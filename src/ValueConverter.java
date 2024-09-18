import java.util.Scanner;
public class ValueConverter {
    public static void main(String[] args) {
        double bellopInSEK , bellopInUSD, bellopInEUR = 0.0;
        System.out.println("Enter bellop In SEK ");
        Scanner scanner = new Scanner(System.in);

        bellopInSEK = scanner.nextDouble();

        System.out.println("Bellop är USD " + bellopInSEK / 10.50);
        System.out.println("Bellop är EUR " + bellopInSEK / 12);

    }
}
