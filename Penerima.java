package project1.KalkulatorZakat;
// pengingat: ada yang error pada salah satu bagian get (bisa jalan tapi)
public class Penerima {
    private String name;
    private double zakatReceived;

    public Penerima(String name) {
        this.name = name;
        this.zakatReceived = 0;
    }
    
    public String getName() {
        return name;
    }

    public double getZakatReceived() {
        return zakatReceived;
    }

    public void setZakatReceived(double zakatReceived) {
        this.zakatReceived = zakatReceived;
    }
}

