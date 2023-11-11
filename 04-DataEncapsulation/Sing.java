public class Sing {
    public static void main(String[] args) {
        String text = "Have a nice day!";
        int numOfCharacters = text.length();
        System.out.println(numOfCharacters);
        String firstNineLetters = text.substring(0,9);
        System.out.println(firstNineLetters);
        System.out.println(text.endsWith("day!"));
    }
}
