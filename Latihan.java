import java.util.Scanner;
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         System.out.print("Total Pembeliam          : ");
        int total = input.nextInt();
        int disc;
        
        if (total <=50.000){
            disc = total * 5/10;
        }else{
            disc = total * 20/100;
        }
        
        System.out.println("Potongan diskon          :  " +disc);
        
        int totalbyr = total - disc;
        System.out.println("Total yang harus dibayar :  " +totalbyr);
    }
    
}
