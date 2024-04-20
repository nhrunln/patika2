import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz:");
        n=sc.nextInt();
        System.out.print("Oluşturulacak r elemanlı farklı grupların eleman sayısını giriniz:");
        r= sc.nextInt();
        double total=1;
        double total1=1;
        double total2=1;
        double kombinasyon;
        for(int i=1;i<=n;i++){
            total=total*i;

        }
        for(int i=1;i<=r;i++){
            total1=total1*i;
        }
        int islem=(n-r);

        for(int i=1;i<=islem;i++){
            total2=total2*i;
        }
        kombinasyon=total/(total1*total2);
        System.out.print("Kombinasyon:"+kombinasyon);
    }
}
