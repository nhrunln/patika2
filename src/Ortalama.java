import java.util.Scanner;
public class Ortalama
{
    public static void main(String[] args) {
        double mat,turkce,fizik,kimya,muzik;
        Scanner sc=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz.");
        mat=sc.nextDouble();

        System.out.print("Türkçe notunuzu giriniz.");
        turkce=sc.nextDouble();

        System.out.print("Fizik notunuzu giriniz.");
        fizik=sc.nextDouble();

        System.out.print("Kimya notunuzu giriniz.");
        kimya=sc.nextDouble();

        System.out.print("Müzik notunuzu giriniz.");
        muzik=sc.nextDouble();

        double dersNotlari=mat+turkce+fizik+kimya+muzik;
        double ortalama=dersNotlari/5;

        if(ortalama>=55){
            System.out.println("Sınıfı geçtiniz."+ortalama);
        }

        else {
            System.out.println("Sınıfta kaldınız.Ortalamanız:"+ortalama);
        }

        //Eğer girilen ders notu 0-100 aralığında değil ise ortalamaya katılmasın.
        int dersSayisi=5;
        int dersAzalt=1;

        System.out.print("Matematik notunu giriniz: ");
         mat = sc.nextDouble();
        System.out.print("Fizik notunu giriniz: ");
         fizik = sc.nextDouble();
        System.out.print("Türkçe notunu giriniz: ");
         turkce = sc.nextDouble();
        System.out.print("Kimya notunu giriniz: ");
         kimya = sc.nextDouble();
        System.out.print("Müzik notunu giriniz: ");
        muzik = sc.nextDouble();
        if(mat<0 && mat>100){
            mat=0;
            dersAzalt--;
        }
        if(fizik<0 && fizik>100){
            fizik=0;
            dersAzalt--;
        }
        if(turkce<0 && turkce>100){
            turkce=0;
            dersAzalt--;
        }
        if(kimya<0 && kimya>100){
            kimya=0;
            dersAzalt--;
        }
        if(muzik<0 && muzik>100){
            muzik=0;
            dersAzalt--;
        }
        double ort=(mat+fizik+turkce+kimya+muzik)/(dersSayisi-dersAzalt);
        if(ort>=55){
            System.out.println("Sınıfı geçtiniz.Ortalamanız:"+ort);
        }
        else {
            System.out.println("Sınıfı geçemediniz.Ortalamanız:"+ort);
        }

    }
}
