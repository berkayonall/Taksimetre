import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km ;
        double perKm = 2.2 ,total , startPrice= 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac Km Gidiceksiniz :  ");
        km = input.nextInt();

        total = (km*perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total ;
        System.out.println("Toplam Fiyat :  " + total);


    }
}
