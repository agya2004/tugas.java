import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka peatama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, ): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka3 = input.nextDouble();


        double hasil = 0;
        switch (operator) {
            case '+':
            hasil = angka1 + angka2 + angka3 ;
            break;
            case '-':
                hasil = angka1 - angka2 - angka3;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Tidak dapat membagi dengan nol.");
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        System.out.println("Hasil: " + hasil);
    }
}