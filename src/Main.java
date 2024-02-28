import java.util.Scanner;

public class Main {
    // Recursive metot: Bir sayının asal olup olmadığını kontrol eder
    static int asal(int num, int i) {
        // Eğer num, i'ye eşitse, num asal bir sayıdır
        if (num == i) {
            return 1;
        } else {
            // Eğer num, i'ye bölünüyorsa, num asal değildir
            if (num % i == 0) {
                return 0;
            } else {
                // Recursive olarak bir sonraki i değeri ile kontrolü sürdürür
                return asal(num, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.print("Sayı giriniz:");
        int num = input.nextInt();
        int i = 2; // İlk bölen 2'den başlar
        System.out.println("---------------------");

        // Asal kontrolü yapılır ve sonuç ekrana yazdırılır
        if (asal(num, i) == 1) {
            System.out.print(num + " Sayısı asaldır !");
        } else {
            System.out.println(num + " Sayısı asal değildir !");
        }
    }
}
