
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String input = loadData();
            int code = searchForCode(input);
            System.out.println(code);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String loadData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner scan = new Scanner(fis);
        String string = scan.nextLine();
        return string;
    }

    public static int searchForCode(String input) {
        int code = 0;
        for (int i = 0; i < input.length(); i++) {
            String characters = input.substring(i, i + 4);
            System.out.println(code);
            char character1 = characters.charAt(0);
            char character2 = characters.charAt(1);
            char character3 = characters.charAt(2);
            char character4 = characters.charAt(3);
            System.out.println(character1);
            System.out.println(character2);
            System.out.println(character3);
            System.out.println(character4);
            if (character1 != character2) {
                if (character1 != character3) {
                    if (character1 != character4) {
                        if (character2 != character3) {
                            if (character2 != character4) {
                                if (character3 != character4) {
                                    return i + 4;
                                }
                            }
                        }
                    }
                }
            }
        }

        return code;
    }
}