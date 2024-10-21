import java.util.Scanner;

public class PenilaianNilaiKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nilai kehadiran (0-100): ");
        int nilaiKehadiran = input.nextInt();
        System.out.print("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = input.nextInt();

      
        double nilaiAkhir = 
                nilaiKehadiran * 0.2 + 
                nilaiTugas * 0.3 + 
                nilaiUTS * 0.2 + 
                nilaiUAS * 0.3;

        if (nilaiAkhir >= 90) {
            System.out.println("Nilai akhir Anda: A");
        } else if (nilaiAkhir >= 80) {
            System.out.println("Nilai akhir Anda: A-");
        } else if (nilaiAkhir >= 70) {
            System.out.println("Nilai akhir Anda: B");
        } else if (nilaiAkhir >= 65) {
            System.out.println("Nilai akhir Anda: B-");
        } else if (nilaiAkhir >= 56) {
            System.out.println("Nilai akhir Anda: C");
        } else if (nilaiAkhir >= 40) {
            System.out.println("Nilai akhir Anda: D");
        } else {
            System.out.println("Nilai akhir Anda: E");
        }
    }
}