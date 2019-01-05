/*
    *boolean

    *byte
    *short
    *int - Integer
    *float
    *double - Double

    *char
    *string - String
 */
public class PrimitiveDataTypes {
    public void explainInteger(){
        int number1 = 3;
        int number2 = 4;
        number1 = 5;
        //number1 = 3.5;
        System.out.println(number1);
    }

    public void explainDouble(){
        double number1 = 7.0;
        double number2 = 2.0;
        System.out.println(number1 / number2);
    }

    public  void castNumber(){
        double number1 = 3.5;
        int number2 = (int)number1;

        System.out.println(number2);
    }

    public void explainString(){
        String text1 = "hello";
        String text2 = "Jiprok";

       System.out.println(text1 + text2);
    }

    public void parseData(){
        String numberText = "1";
        int number = 2;

        System.out.println(numberText + number);
        System.out.println(Integer.valueOf(numberText) + number);
        System.out.println(number + "" + "hello");
    }
}
