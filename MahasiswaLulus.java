package utspbo;

public class MahasiswaLulus extends Mahasiswa {
    private int tahunWisuda;
    private float ipk;
    
    // Konstruktor
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }
    
    // Getter dan Setter untuk atribut tahunWisuda
    public int getTahunWisuda() {
        return tahunWisuda;
    }
    
    public void setTahunWisuda(int tahunWisuda) {
        this.tahunWisuda = tahunWisuda;
    }
    
    // Getter dan Setter untuk atribut ipk
    public float getIpk() {
        return ipk;
    }
    
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}