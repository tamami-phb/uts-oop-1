package service;

import java.util.LinkedList;
import java.util.List;

import model.Mahasiswa;

public class MahasiswaService {

    private static List<Mahasiswa> data = new LinkedList<>();

    public void addData(Mahasiswa mhs) {
        data.add(mhs);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Mahasiswa mhs) {
        int result = data.indexOf(mhs);
        
        if(result >= 0) {
            data.set(result, mhs);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Mahasiswa mhs) {
        int result = data.indexOf(mhs);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Mahasiswa> getAllData() {
        return data;
    }

}