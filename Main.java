import java.util.Scanner;

public class Main {
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

            ints[i] = ints[i] + k;
            if (ints[i] > 122)
                ints[i] =  ints[i] - 122 + 97;
            if (ints[i] > 90 && ints[i] < 97) {
                ints[i] = ints[i] - 90 + 64;
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


