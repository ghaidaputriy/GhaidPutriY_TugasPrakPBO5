import java.util.Scanner;
public class BiodataMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Tampilan input
        System.out.print("NPM               : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa    : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran   : ");
        double nilai = input.nextDouble();
        System.out.print("Nilai Tugas       : ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS         : ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS         : ");
        double uas = input.nextDouble();
        
        //Menghitung nilai akhir
        double nilaiAkhir = (0.10 * nilai ) + (0.20 * tugas ) + (0.30 * uts) + (0.40 * uas);
         
        //Menghitung grade
        char grade;
        String ket;
        
        if (nilaiAkhir >= 76){
            grade = 'A';
                    ket = "Istimewa";
        }else if (nilaiAkhir >= 66){
            grade = 'B';
                    ket = "Baik";
        }else if (nilaiAkhir >= 56){
            grade = 'C';
                    ket = "Cukup";
        }else if (nilaiAkhir >= 46){
            grade = 'D';
                    ket = "Kurang Sekali";
        }else {
            grade = 'E';
                    ket = "Kurang sekali";
        }
        
        // Tampilan Output
        System.out.println("\nNPM Mahasiswa           : " + npm);
        System.out.println("Nama Mahasiswa          : " + nama);
        System.out.println("Nilai Rata Rata         : " + nilaiAkhir);
        System.out.println("Grade                   : " + grade);
        System.out.println("Keterangan              : " + ket);
        
    }
    
}
