package Stringss;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            System.out.println(ch);
            series += ch;
        }

        System.out.println(series);//new string object is created everytime;
    }
}
