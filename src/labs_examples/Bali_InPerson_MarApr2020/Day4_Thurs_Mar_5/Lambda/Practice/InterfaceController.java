package labs_examples.Bali_InPerson_MarApr2020.Day4_Thurs_Mar_5.Lambda.Practice;

public class InterfaceController {
    public static void main(String[] args) {

        //invoking lambda from another method
        double printSum = sumMethod();
        System.out.println("lambda takes no parameter and calling from another method: " + printSum);

        //invoking lambda right in the main method
        SomeInterface takesNoParameter = () -> {
            int a = 20;
            int b = 32;

            float c = (float) ((double) a + b);
            return c;
        };
        System.out.println("Takes no parameter defined within main method: " + takesNoParameter.noParameter());

        //------------------------------------------------------

        SomeInterface2 someInterface2 = (b, c) -> (int) (b / c);
        int sum = (int) someInterface2.TwoParameter(55.45,62.33);
        System.out.println(sum);


    }
    public static double sumMethod(){
        SomeInterface takesNoParameter = () -> {
            int a = 24;
            int b = 32;

            double c = (int) a + b;
            return c;
        };
        double sum = takesNoParameter.noParameter();
        return sum;
    }


}
