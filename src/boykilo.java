import java.util.Scanner;
public class boykilo {
    public static void main(String[] args) {
       double kilo,boy,kutleIndeks;
       Scanner sc=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:");
        kilo=sc.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden)giriniz:");
        boy= sc.nextDouble();
        kutleIndeks=kilo / (boy * boy);
        System.out.println("Vucüt kütle indeksiniz:"+kutleIndeks);
    }
}
