import java.util.Scanner;

public class Deshevrovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s = scanner.nextLine();

        char[] chars = new char[s.length()];
        int[] ints = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
            ints[i] = chars[i];
        }
        System.out.println("Введите ключ: ");
        int k = scanner.nextInt();
        //printArrayi(ints);

        for (int i = 0; i < s.length(); i++) {

            ints[i] = ints[i] - k;
            if (ints[i] < 97 && ints[i] > 90) {
                ints[i] =  123 - 97 + ints[i]  ;
            }
            if (ints[i] < 65) {
                ints[i] =  91 - 65 + ints[i]  ;
            }
            chars[i] = (char) ints[i];

        }
        //printArrayi(ints);
        printArray(chars);

    }
    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }


    public static void printArrayi(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


