import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double perKm=2.20,tutar,acilis=10;
        int km;
        Scanner sc=new Scanner(System.in);
        System.out.println("Gidilen kilometreyi giriniz:");
        km=sc.nextInt();

        tutar=(perKm*km);
        tutar += acilis;
        System.out.println("Toplam tutar:"+tutar);
        if (tutar<20){
            System.out.println("Minimum 20 tl ödenebilir. ");
        }
        else{
            System.out.println("Tutarınızı ödeyebilirsiniz.");
        }
    }
}
