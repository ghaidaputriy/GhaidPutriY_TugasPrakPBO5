import java.util.Scanner;
public class IMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Memasukan berat badan & tinggi badan
        System.out.print("Berat Badan (Kg)   : " );
        double bb = input.nextDouble();
        System.out.print("Tinggi Badan (m)   : " );
        double tb = input.nextDouble();

        //Menghitung IMT
        double imt = bb / (tb * tb);
        
        String kriteria;
        if (imt < 18.5){
            kriteria = "Berat Badan Kurang";
        }else if (imt >= 18.5 && imt <=24.9){
            kriteria = "Berat Badan Ideal";
        }else if (imt >= 25 && imt <=29.9){
            kriteria = "Berat Badan Lebih";
        }else if (imt >= 30 && imt <=39.9){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat Gemuk";
        }
        
        //Menampilan Output
        System.out.println("\nHasil Imt     : " + imt );
        System.out.println("Kriteria        : " + kriteria );
        
        input.close();
    }
}
