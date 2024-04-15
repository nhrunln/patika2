import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
    double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlicanF=5.00,armutKg,elmaKg,domatesKg,muzKg,patlicanKg,toplam;
    Scanner sc=new Scanner(System.in);
        System.out.print("Elma kaç kilo?");
        elmaKg= sc.nextDouble();
        System.out.print("Armut kaç kilo?");
        armutKg=sc.nextDouble();
        System.out.print("Domates kaç kilo?");
        domatesKg= sc.nextDouble();
        System.out.print("Muz kaç kilo?");
        muzKg= sc.nextDouble();
        System.out.print("Patlıcan kaç kilo?");
        patlicanKg= sc.nextDouble();
        toplam=elmaKg*elmaF+armutF*armutKg+domatesKg*domatesF+muzF*muzKg+patlicanKg*patlicanF;
        System.out.print("Toplam tutarınız:"+toplam);




    }
}
