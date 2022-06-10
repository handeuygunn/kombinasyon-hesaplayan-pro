import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,r;
        int i;

        System.out.println("1.Sayiyi girniz:");
        n= input.nextInt();

        System.out.println("2.Sayiyi girniz:");
        r= input.nextInt();



        int sonuc = 1;

        for (i = 1; i<=n; i++){
            sonuc = sonuc * i;
        }
        int sonuc2 = 1;
        for (i=1; i<=r;i++){
            sonuc2 = sonuc2 *i;
        }
        int sonuc3=1;
        for (i=1; i<=(n-r);i++){
            sonuc3 = sonuc3 *i;
        }

        int toplam= sonuc/(sonuc2*sonuc3);
        System.out.println( toplam);

    }
}
