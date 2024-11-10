package project1.KalkulatorZakat;
import java.util.Scanner;

public class KalkulatorZakat {
    private static final double NISAB = 8500000;
    private static final double ZAKAT_RATE = 0.025;
    private static final double NISAB_FITRAH = 3.5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine();

            Muzaki muzaki = new Muzaki(nama, 0, 0);

            System.out.println("\nPilih jenis zakat yang ingin dihitung:");
            System.out.println("1. Zakat Harta");
            System.out.println("2. Zakat Fitrah");
            System.out.print("Pilihan yang di inginkan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah harta Anda (dalam desimal): Rp ");
                    double harta = input.nextDouble();
                    muzaki.setHarta(harta);

                    if (muzaki.getHarta() < NISAB) {
                        System.out.println("Jumlah harta Anda belum mencapai nisab. Zakat tidak wajib.");
                    } else {
                        double zakatHarta = muzaki.getHarta() * ZAKAT_RATE;
                        System.out.println("Jumlah zakat harta yang harus dibayarkan: Rp " + zakatHarta);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlah jiwa yang ingin zakat fitrah: ");
                    int jumlahJiwa = input.nextInt();
                    muzaki.setJumlahJiwa(jumlahJiwa);

                    System.out.print("Masukkan harga beras per kg (dalam desimal): Rp ");
                    double hargaBeras = input.nextDouble();

                    double zakatFitrahTotal = muzaki.getJumlahJiwa() * NISAB_FITRAH * hargaBeras;
                    System.out.println("Jumlah zakat fitrah yang harus dibayarkan: Rp " + zakatFitrahTotal);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("\nIngin menghitung zakat lagi? (y/n): ");
            String jawaban = input.next();
            lanjut = jawaban.equalsIgnoreCase("y");
            input.nextLine(); 
        }

        System.out.println("Terima kasih.");
    }
}

