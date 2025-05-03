package Codelab.Modul3;

// Kelas KarakterGame (Superclass)
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk kesehatan
    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan di-override oleh subclass
    public void serang(KarakterGame target) {
        // Default implementation, bisa di-override
    }
}