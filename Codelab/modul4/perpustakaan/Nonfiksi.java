package Codelab.modul4.perpustakaan;

public class Nonfiksi extends Buku {
    private String subjek;

    public Nonfiksi(String judul, String penulis, String subjek) {
        super(judul, penulis);
        this.subjek = subjek;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + judul + " oleh " + penulis + " (subjek: " + subjek + ")");
    }
}