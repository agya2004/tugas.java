package project1.KalkulatorZakat;
// pengingat : ada bagian yang bisa di tambahkan lagi!!!
public class Muzaki {
    private String name;
    private double harta; 
    private int jumlahJiwa; 

    public Muzaki(String name, double harta, int jumlahJiwa) {
        this.name = name;
        this.harta = harta;
        this.jumlahJiwa = jumlahJiwa;
    }

    public String getName() {
        return name;
    }

    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
    }

    public int getJumlahJiwa() {
        return jumlahJiwa;
    }

    public void setJumlahJiwa(int jumlahJiwa) {
        this.jumlahJiwa = jumlahJiwa;
    }
}
