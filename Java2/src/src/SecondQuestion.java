import java.util.Scanner;

//WAP to sorting string without using string Methods?.
public class SecondQuestion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char charArray[] = new char[str.length()];
        str = str.toLowerCase();
        int index = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    charArray[index++] = (char) i;
                }
            }
        }

        System.out.println(charArray);
    }
}
