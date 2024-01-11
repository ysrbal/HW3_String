import java.util.Scanner;

public class Runner_Question_3 {
    public static void main(String[] args) {
        System.out.print("Lütfen IBAN numaranızı giriniz .......... : ");
        String iban = new Scanner(System.in).nextLine();
        if (iban.toUpperCase().startsWith("TR")) {
            System.out.println("Yurtiçi işlemler");
            if (iban.endsWith("5001")) {
                System.out.println("Ziraat Bankası");
            } else if (iban.endsWith("5002")) {
                System.out.println("Garanti Bankası");
            } else if (iban.endsWith("5003")) {
                System.out.println("Türkiye İş Bankası");
            } else {
                System.err.println("Hatalı Giriş Yaptınız....");
            }
        } else if (iban.toUpperCase().startsWith("OTH")) {
            System.out.println("Yurt dışı işlemler");
            if (iban.endsWith("2000")) {
                System.out.println("Kıta İçi İşlemler ... :  " + iban.replace("OTH", "Ki"));
            } else {
                System.out.println("Kıta Dışı İşlemler .. : " + iban.replace("OTH", "Kd"));
            }
        }
    }
}
