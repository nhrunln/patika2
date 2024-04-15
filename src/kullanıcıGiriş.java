import java.util.Scanner;
public class kullanıcıGiriş {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username="patika",password="java123",usernameCheck,passwordCheck;
        int select;

        System.out.print("Kullanıcı Adınız:");
        usernameCheck=sc.nextLine();
       // System.out.print("Şifreniz:");
        //password=sc.nextLine();


        if(!username.equals(usernameCheck)){
            System.out.println("Hatalı giriş yaptınız!Şifrenizi güncellemek ister misiniz?1-evet\n2-hayır");
            String choice=sc.next();
            if(choice.equals("1")){
                System.out.println("Yeni şifreniz:");
                passwordCheck=sc.next();
                if(password.equals(passwordCheck)){
                    System.out.println("Şifre oluşturulamadı.Lütfen tekrar deneyiniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }

            }
        }
        else {
            System.out.print("Password: ");
            passwordCheck = sc.next();
            if (password.equals(passwordCheck)) {
                System.out.println("Girişiniz başarılı!");
            } else {
                System.out.println("Şifreniz yanlış.Lüften tekrar deneyiniz.");
            }
        }


    }
}
