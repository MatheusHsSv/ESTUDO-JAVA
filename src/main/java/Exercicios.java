import java.util.Locale;

public class Exercicios {
    public  static  void main(String[] args){

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        String gender = "M";

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Computer, Which price is %.2f%n", price1);
        System.out.printf("Office Desk, which price is %.2f%n",price2);
        System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);

        System.out.printf("with eight decimal places: %.8f%n", measure);
        System.out.printf("(three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);



    }
}

