package Codelab.Modul2;

public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public RekeningBank(String noRek, String nama, double saldoAwal){
        nomorRekening = noRek;
        namaPemilik = nama;
        saldo = saldoAwal;
    }
    public void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.print(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        System.out.println();
    }
    public void tarikUang(double jumlah){
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) saldo sekarang: Rp" + saldo);
        } else {
            System.out.print( namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) saldo saat ini: Rp" + saldo);
        }
        System.out.println();
    }
}