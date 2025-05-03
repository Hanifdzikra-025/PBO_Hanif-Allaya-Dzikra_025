package Codelab.Modul2;

// definisi kelas hewan
public class Hewan {
    // mendeklarasikan variabel 'nama,jenis,suara' dgn tipe data string
    String nama;
    String jenis;
    String suara;

    // mendeklarasikan kelas hewan dengan 3 parameter 'nama,jenis,suara'
    public Hewan(String nama, String jenis, String suara) {
        // menginisialisasikan variabel instance 'nama,jenis,suara' dgn nilai dari parameter
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }
    // mendendefiniskan metode 'tampilinfo' yang tidak mengembalikan nilai(void)
    public void tampilkanInfo() {
        // mencetak nilai dari variabel 'nama,jenis,suara'
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}
