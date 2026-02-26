package Jobsheet2;

public class MataKuliahMain03 {

    public static void main(String[] args) {

        MataKuliah03 mk1 = new MataKuliah03();

        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(3);

        mk1.tampilInformasi();

        MataKuliah03 mk2 = new MataKuliah03("BD", "Basis Data", 3, 5);

        mk2.tampilInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangJam(10);

        mk2.tampilInformasi();
    }
}
