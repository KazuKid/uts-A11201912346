package utspbo;

public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    // Konstruktor
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }
    
    // Getter dan Setter untuk atribut asalSekolah
    public String getAsalSekolah() {
        return asalSekolah;
    }
    
    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }
}