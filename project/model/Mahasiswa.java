package model;

public class Mahasiswa {

    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public boolean equals(Object obj) {
        Mahasiswa mhs = (Mahasiswa) obj;
        if(this.nim.equals(mhs.getNim())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + nim + ", " + nama + ", " + kelas + " ];";
    }



    public void setNim(String nim) { this.nim = nim; }

    public String getNim() { return nim; }

    public void setNama(String nama) { this.nama = nama; }

    public String getNama() { return nama; }

    public void setKelas(String kelas) { this.kelas = kelas; }

    public String getKelas() { return kelas; }

}