import java.util.Scanner;

public class kalkulatorzakat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nisab = 8500000; 
        double zakatRate = 0.025;
        double nisabFitrah = 3.5; 

        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Pilih jenis zakat yang ingin dihitung:");
            System.out.println("1. Zakat Harta");
            System.out.println("2. Zakat Fitrah");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah harta Anda (dalam rupiah): Rp ");
                    double harta = input.nextDouble();

                    if (harta < nisab) {
                        System.out.println("Jumlah harta Anda belum mencapai nisab. Zakat tidak wajib.");
                    } else {
                        double zakat = harta * zakatRate;
                        System.out.println("Jumlah zakat harta yang harus dibayarkan: Rp " + zakat);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlah jiwa yang wajib zakat fitrah: ");
                    int jumlahJiwa = input.nextInt();
                    System.out.print("Masukkan harga beras per kg (dalam rupiah): Rp ");
                    double hargaBeras = input.nextDouble();

                    double zakatFitrahTotal = jumlahJiwa * nisabFitrah * hargaBeras;
                    System.out.println("Jumlah zakat fitrah yang harus dibayarkan: Rp " + zakatFitrahTotal);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Ingin menghitung zakat lagi? (y/n): ");
            String jawaban = input.next();
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih.");
    }
}