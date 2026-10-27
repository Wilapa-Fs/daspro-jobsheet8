import java.util.Scanner;
public class Retangle29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah baris : ");
        int baris = input.nextInt();

        System.out.print("Masukan jumlah kolom : ");
        int kolom = input.nextInt();

    for(int i = 1; i <= baris; i++) {

        for (int j = 1; j <= kolom; j++){
            System.out.print("#");
        }  
        System.out.println(); 
    }


        input.close();
        
    }
    
}
