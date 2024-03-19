import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite alguma coisa..: ");
        String input = scanner.nextLine();

        String invertida = inverter(input);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverter(String str) {

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char flag = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = flag;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
