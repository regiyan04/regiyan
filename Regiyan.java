import java.util.Scanner;

public class Regiyan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jam masuk
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();

        // Input jam keluar
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = input.nextInt();

        // Input biaya per jam
        System.out.print("Masukkan biaya per jam: ");
        double biayaPerJam = input.nextDouble();

        // Hitung durasi parkir
        int durasiParkir = jamKeluar - jamMasuk;

        // Hitung biaya parkir
        double biayaParkir = durasiParkir * biayaPerJam;

        // Tampilkan hasil
        System.out.println("Durasi parkir: " + durasiParkir + " jam");
        System.out.println("Biaya parkir: " + biayaParkir);

        input.close();
    }
}
