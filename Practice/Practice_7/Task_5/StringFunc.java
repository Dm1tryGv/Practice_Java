package Practice.Practice_7.Task_5;

public class StringFunc implements Stringble {

    @Override
    public int charCount(String string) {
        return string.length();
    }

    @Override
    public String uneven(String string) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i < string.length(); i++){
            if (i % 2 == 1) {
                answer.append(string.charAt(i));
            }
        }
        return answer.toString();
    }

    @Override
    public String invert(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
