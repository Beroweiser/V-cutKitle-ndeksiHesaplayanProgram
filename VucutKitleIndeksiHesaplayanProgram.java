import java.util.Scanner;
public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        double kilo,boy,index;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = asd.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = asd.nextDouble();

        index = kilo / (boy*boy);

        System.out.println("Vücut Kitle Indexiniz : "+ index);

        
    }
}
