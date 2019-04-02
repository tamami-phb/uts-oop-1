import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static MahasiswaService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new MahasiswaService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String nim, nama, kelas;

        System.out.println("--- tambah data ---");
        System.out.print("NIM : "); 
        scanner = new Scanner(System.in);
        nim = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Kelas : ");
        kelas = scanner.nextLine();
        service.addData(new Mahasiswa(nim, nama, kelas));
    }

    private static void tampilData() {
        LinkedList<Mahasiswa> result = (LinkedList<Mahasiswa>) service.getAllData();

        int i=1;
        for(Mahasiswa mhs : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  nim: " + mhs.getNim());
            System.out.println("  nama: " + mhs.getNama());
            System.out.println("  kelas: " + mhs.getKelas());
        }
    }

    private static void ubahData() {
        String nim, nama, kelas;

        System.out.println("--- perubahan data ---");
        System.out.print("NIM : "); 
        scanner = new Scanner(System.in);
        nim = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Kelas : ");
        kelas = scanner.nextLine();
        service.updateData(new Mahasiswa(nim, nama, kelas));
    }

    private static void hapusData() {
        String nim;

        System.out.println("--- hapus data ---");
        System.out.print("NIM : ");
        scanner = new Scanner(System.in);
        nim = scanner.nextLine();
        service.deleteData(new Mahasiswa(nim, null, null));
    }

}