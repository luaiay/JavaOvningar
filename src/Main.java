import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        double length ,lengthFamn, lengthAlnar, lengthTum, lengthFot =0.0;

        System.out.println("Enter Length in Famnar : ");
        lengthFamn = scanner.nextDouble();
        length = lengthFamn* 182.88;
        System.out.println("Lengths in CM is " + length)  ;


        System.out.println("Enter Length Alnar : ");
        lengthAlnar = scanner.nextDouble();
        length = lengthAlnar * 59.37;
        System.out.println("Lengths in CM are " + length)  ;


        System.out.println("Enter Length Tum : ");
        lengthTum = scanner.nextDouble();
        length = lengthTum *  2.54;
        System.out.println("Lengths in CM are " + length)  ;


        System.out.println("Enter Length Fot : ");
        lengthFot = scanner.nextDouble();
        length = lengthFot *  30.48;
        System.out.println("Lengths in CM are " + length)  ;


        }
    }
