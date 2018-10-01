
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Merubah Kalimat Yang di inputkan menjadi huruf besar dan huruf kecil
 */
package pkgif.pkg3.pkg10117110.latihan27.hurufbesarkecil;

import java.util.Scanner;


public class IF310117110Latihan27HurufBesarKecil {


    public static void main(String[] args) {
       
       String Kalimat;
       Scanner scan = new Scanner(System.in);
       
       
        
       System.out.print("Masukan Kalimat : ");
       Kalimat = scan.nextLine();
       
       String Kalimat1 = Kalimat.toUpperCase();
       String Kalimat2 = Kalimat.toLowerCase();
       System.out.println();
       System.out.println();
       System.out.println("Huruf Besar : " + Kalimat1);
       System.out.println("Huruf Kecil : " + Kalimat2);

    }
    
}
