import java.util.Scanner;
public class daire
{
    public static void main(String[] args) {
        int r;
       double piSayisi=3.14,alfa,daireDilimAlani;
       Scanner sc=new Scanner(System.in);
       System.out.println("r yarıçapını giriniz:");
       r= sc.nextInt();
       System.out.println("Alfa açısını giriniz:");
       alfa=sc.nextDouble();
       daireDilimAlani=(piSayisi * (r*r) * alfa) / 360;
       System.out.println("Daire diliminin alanı:"+daireDilimAlani);
    }
}
