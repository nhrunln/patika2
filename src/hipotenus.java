import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("İlk kenarı giriniz:");
        a=sc.nextInt();
        System.out.println("İkinci kenarı giriniz:");
        b=sc.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus değeri:"+c);
    }
}
