import java.util.Scanner;
public class ÜslüSayı {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        a=sc.nextInt();
        System.out.print("Üs olacak sayıyı yazınız:");
        b=sc.nextInt();
        int total=1;
        for(int i=1;i<=b;i++){
            total*=a;

        }System.out.println("Üslü Sayınız:"+total);
    }

}
