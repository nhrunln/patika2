import java.util.Scanner;
public class dene {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
       Scanner sc=new Scanner(System.in);
       System.out.println("Ücretinizin tutarını giriniz:");
       tutar=sc.nextDouble();
       kdvTutar=tutar*kdvOran;
       kdvliTutar=tutar+kdvTutar;
        System.out.println("Kdvsiz Tutar:"+tutar);
        System.out.println("Kdv Oranı:"+kdvOran);
        System.out.println("Kdv Tutarı"+kdvTutar);
        System.out.println("Kdvli Tutar:"+kdvliTutar);




    }
}
