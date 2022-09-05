import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {

        double tutar , kdvOran= 0.18 ,kdvTutar, kdvliTutar ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");

        tutar = inp.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : " + tutar  );
        System.out.println("Kdv Oranı : " + kdvOran  );
        System.out.println("Kdv Tutarı : " + kdvTutar  );
        System.out.println("Kdvli Tutar : " + kdvliTutar  );

    }
}
