//üçgena alanı
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double a, b, c, alan, u;
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        a = input.nextDouble();
        System.out.println("2. kenarı giriniz: ");
        b = input.nextDouble();
        System.out.println("3. kenarı giriniz: ");
        c = input.nextDouble();
        u = (a + b + c)/2;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c)) ;
		//Math.sqrt --> sayının karekökünü almak için kullanılır.  
        System.out.println("Üçgenin alanı: " +alan);
    }
}