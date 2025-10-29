/*Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r
elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter the value of n:");
        int n=input.nextInt();
        System.out.print("Please enter the value of r:");
        int r=input.nextInt();
        double nfakt=1,rfakt=1,nfarktfakt=1;

        for(int i=1;i<=n;i++) nfakt*=i;
        for(int i=1;i<=r;i++) rfakt*=i;
        for (int i = 1; i <= (n - r); i++) nfarktfakt *= i;

        double sonuc= ((nfakt ) / (rfakt * nfarktfakt));
        System.out.println("C("+n+","+r+") =" +sonuc);
}}