package utspbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int semester;
    private int usia;
    private String krs;
    
    public Mahasiswa() {
        
    }
    
    public Mahasiswa(String nim, String nama, int semester, int usia, String krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }
    
    
    
    public void inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("NIM: ");
        nim = scanner.nextLine();
        
        System.out.print("Nama: ");
        nama = scanner.nextLine();
        
        System.out.print("Semester: ");
        semester = scanner.nextInt();
        
        System.out.print("Usia: ");
        usia = scanner.nextInt();
        
        scanner.nextLine(); // Membersihkan karakter newline (\n) yang masih tersisa
        
        System.out.print("KRS: ");
        krs = scanner.nextLine();
    }
    
    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
        System.out.println("KRS: " + krs);
    }
    
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        // Membersihkan karakter newline (\n) yang masih tersisa
        scanner.nextLine();
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa " + (i+1));
            
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.inputMahasiswa();
            
            daftarMahasiswa.add(mahasiswa);
        }
        
        // Menampilkan data mahasiswa yang telah dimasukkan
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.infoMahasiswa();
            System.out.println("------------------------------------");
        }
    }
}