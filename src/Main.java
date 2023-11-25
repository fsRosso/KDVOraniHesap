import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani=0.18, kdvTutari, kdvliTutar;

        Scanner inp= new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();

        kdvTutari= (tutar*kdvOrani);
        kdvliTutar=(kdvTutari+tutar);

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV'li Tutar: "+ kdvliTutar);
    }
}