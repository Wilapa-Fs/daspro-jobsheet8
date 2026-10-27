import java.util.Scanner;
public class Tugas329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int totalPelangganSemua = 0;
        int totalBarangSemua = 0;
        int tokoTerbaik = 1;
        int barangTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;

            do {
                System.out.print("Jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;

                do {
                    System.out.print("Barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i
                    + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalPelangganSemua += jumlahPelanggan;
            totalBarangSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbaik = i;
            }
        }

        System.out.println("Total pelanggan seluruh toko: "
                + totalPelangganSemua);
        System.out.println("Total barang seluruh toko: "
                + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbaik);

        sc.close();
    }
}