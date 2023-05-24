import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Random random = new Random();
    int wylosowanalb = random.nextInt(101);
    int zgadnietalb;
    Scanner scanner = new Scanner(System.in);
    System.out.println(wylosowanalb);

   
    do {
       System.out.println("Zgadnij wylosowana liczbe z zakresu od 0 do 100:");
      zgadnietalb = scanner.nextInt();
      if (zgadnietalb < wylosowanalb) System.out.println("Wylosowana liczba jest wieksza spróboj jeszcze raz");
      if (zgadnietalb > wylosowanalb) System.out.println("Wylosowana liczba jest mniejsza spróboj jeszcze raz");
      if (zgadnietalb == wylosowanalb) System.out.println("!!!Gratulacje trafiles!!!");
    } while (wylosowanalb != zgadnietalb);
    
  }
}