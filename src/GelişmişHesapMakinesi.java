import java.util.Scanner;
public class GelişmişHesapMakinesi {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam:"+result);
        return result;
    }
    static int cikar(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }
    static int carp(int a,int b){
        int result=a*b;
        System.out.println("Çarpma:"+result);
        return result;
    }
    static int bol(int a,int b){
        int result=a/b;
        System.out.println("Bölüm:"+result);
        return result;
    }
    static int us(int a,int b){
        int result=1;
     for(int i=1;i<=b;i++){
         result*=a;
     }
     return result;
    }
    static int mod(int a,int b){
        int result=a%b;
        System.out.println("Mod:"+result);
        return result;
    }
    static void hesap(int a,int b){
        System.out.println("Çevresi:"+(2*(a*b)));
        System.out.println("Alanı:"+(a*b));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int select;
        String menu="1-Toplama İşlemi\n"+
                "2-Çıkarma İşlemi\n"+
                "3-Çarpma İşlemi\n"+
                "4-Bölme İşlemi\n"+
                "5-Üslü Sayı Hesaplama\n"+
                "6-Mod Alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "0-Çıkış Yap";
        while(true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select=sc.nextInt();
            if(select==0){
                break;
            }

            System.out.print("İlk sayı:");
            int a=sc.nextInt();
            System.out.print("İkinci sayı:");
            int b=sc.nextInt();


            switch(select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                   if( bol(a,b)==0){
                       System.out.println("İkinci sayı 0'dan farklı olmalı");
                   }
                    break;
                case 5:
                    System.out.println("Üs hesabı:"+us(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    hesap(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");

            }

        }
        System.out.println("GÜLE GÜLE!");
    }
}
