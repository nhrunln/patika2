import java.util.Scanner;
public class KuvvetAlma {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        n=sc.nextInt();
       for(int i=1;i<=n;i*=20){
           System.out.println(i);
       }
    }
}
