public class Songer {
    String text;
    int numOfCharacters(){
        return text.length();
    }
    String firstLetters(int x){
        text.strip();
        text.substring(0,x);
        return text;
    }
    boolean checkIfEndsWith(String ending){
        return text.endsWith(ending);
    }
    boolean isNotEmpty(){
        return text.isEmpty();
    }
    int lastIndexOf(String x){
        return text.lastIndexOf(x);
    }
    String minuses(){
        return text.replace(" ","-");
    }
    String Uppercase(){
        return text.toUpperCase();
    }
}
