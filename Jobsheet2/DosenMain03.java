package Jobsheet2;

public class DosenMain03 {

    public static void main(String[] args) {

        Dosen03 d1 = new Dosen03();

        d1.idDosen = "D001";
        d1.nama = "Dr. Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman Dasar";

        d1.tampilInformasi();

        d1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        d1.ubahKeahlian("Kecerdasan Buatan");

        d1.tampilInformasi();

        Dosen03 d2 = new Dosen03(
                "D002",
                "Prof. Budi",
                true,
                2010,
                "Basis Data"
        );

        d2.tampilInformasi();

        d2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2026) + " tahun");
        d2.ubahKeahlian("Data Science");

        d2.tampilInformasi();
    }
}
