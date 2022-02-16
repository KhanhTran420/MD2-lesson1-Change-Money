import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {


        double USD;
        double VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        USD = scanner.nextDouble();
        double change = USD*23000;
        System.out.println("Giá trị VND: " + change);
    }
}