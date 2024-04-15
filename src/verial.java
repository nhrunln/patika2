import java.util.Scanner;
public class verial {
    public static void main(String[] args) {
        //değerleri tanımla
        int mat,fizik,kimya,turkce,tarih,muzik;
        //scanner sınıfı oluştur
        Scanner sc=new Scanner(System.in);
        //kullanıcıdan değer alalım
        System.out.println("Matematik notunuz:");
        mat =sc.nextInt();
        System.out.println("Fizik notunuz:");
        fizik=sc.nextInt();
        System.out.println("Kimya notunuz:");
        kimya=sc.nextInt();
        System.out.println("Türkçe notunuz:");
        turkce=sc.nextInt();
        System.out.println("Tarih notunuz:");
        tarih=sc.nextInt();
        System.out.println("Müzik notunuz:");
        muzik=sc.nextInt();
        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama=toplam/6.0;
        System.out.println("Ortalamanız:"+ortalama);
        if(ortalama>=60){
            System.out.println("Tebrikler Geçtiniz!");
        }
        else{
            System.out.println("Çalışmalısın Kaldın:(");
        }

    }
}
