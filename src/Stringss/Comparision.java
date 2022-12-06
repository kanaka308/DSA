package Stringss;

public class Comparision {
    public static void main(String[] args) {
        String name = new String(("Shiva"));
        String realName = new String("Shiva");
        String rName = "Shiva";
        String nName = "Shiva";

        System.out.println(name==realName);
        System.out.println(name == rName);
        System.out.println(nName == rName);
        System.out.println(name.equals(realName));//checks actual values;


        //some checks
        Integer number = 100;
        Integer num = new Integer(100000);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println(number);
    }
}
