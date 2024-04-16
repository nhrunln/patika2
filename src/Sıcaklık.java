import java.util.Scanner;
public class Sıcaklık {
    public static void main(String[] args) {
        int sicaklik;
        Scanner sc=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz:");
        sicaklik=sc.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        }
        if(sicaklik>5&&sicaklik<=10){
            System.out.println("Sinemaya gidebilirsin.");
        }
        if(sicaklik>10&&sicaklik<15){
            System.out.println("Sinemaya ya da Pikniğe gidebilirsin.");
        }
        if(sicaklik>=15&&sicaklik<25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
