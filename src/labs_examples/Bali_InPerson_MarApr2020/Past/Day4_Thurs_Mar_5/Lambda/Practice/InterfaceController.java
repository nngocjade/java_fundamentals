package labs_examples.Bali_InPerson_MarApr2020.Past.Day4_Thurs_Mar_5.Lambda.Practice;

public class InterfaceController {
    public static void main(String[] args) {

        //--------------------SomeInterface1--------------------------

        //invoking lambda from another method
        double printSum = sumMethod();
        System.out.println("lambda takes no parameter and calling from another method: " + printSum);

        //invoking lambda right in the main method
        double a = 24.54;
        double b = 32.54;
        SomeInterface takesNoParameter = () -> (int) ((double) a + b);
        System.out.println("Takes no parameter defined within main method: " + takesNoParameter.noParameter());

        //----------------------SomeInterface2-------------------------

        // lambda, method body on one line
        SomeInterface2 someInterface2 = (d, c) -> (int) (d * c);
        int multiply = (int) someInterface2.TwoParameter(55.45,62.33);
        System.out.println("lambda takes in two parameter and multiplies: " + multiply);

        //lambda, method body in curly brackets
        SomeInterface2 someInterface21 = (d, c) -> {
            return d * c;
        };
        int multiply1 = (int) someInterface21.TwoParameter(55.45, 62.33);
        System.out.println();

        //-----------------------SomeInterface3-----------------------

        // lambda, method body on one line
        SomeInterface3 someInterface3 = (val1) -> (val1 >= 1);
        Boolean aBoolean = someInterface3.trueOrFalse(4);
        System.out.println(aBoolean);

        //lambda, method body in curly brackets
        int x = 20;
        SomeInterface3 someInterface31 = val1 -> {
            if (val1 == x && val1 >= 3){
            }else{
                return false;
            }
            return true;
        };
        boolean aBoolean1 = someInterface31.trueOrFalse(1);
        System.out.println("if logic is true print true, else, false: " + aBoolean1);

        //--------------------------------------GenericInterface----------------------------------

        // lambda, method body on one line
        GenericInterface<Integer, Double, String> genericInterface = (Double d, String s) -> (int)(Double.parseDouble(s) * d);
        int cast = genericInterface.convert(23.44, "2");
        System.out.println("\nlambda on one line - converting a string to double and casting it to an integer: " + cast);

        //lambda, method body in curly brackets
        GenericInterface<Integer, Double, String> genericInterface1 = (Double d, String s) ->{

            int e = 12;
            int c;
            if (d >= 2){
                c = (int) (Double.parseDouble(s)*d) + e;
                return c;
            }else {
                return null;
            }
        };
        int casting = genericInterface1.convert(2.33,"12");
        System.out.println("lambda inside curly brackets - converting a string to double and casting it to an integer: " + casting);

        //--------------------------------------GenArraylistInterface----------------------------


//        GenArrlistInterface<ArrayList<Integer>, Integer> genericInterface2 = (Integer[] vals) -> {
//            //taking in an array and returning an arraylist
//
//            for(Integer i :vals) {
//                Array.setInt(vals, 0,33);
//                Array.setInt(vals, 1,44);
//                Array.setInt(vals, 2,55);
//                Array.setInt(vals, 3,66);
//                Array.setInt(vals, 4,77);
//                Array.setInt(vals, 5,88);
//                Array.setInt(vals, 6,99);
//            }
//            System.out.println(i);
//
//            return null;
//        };
//
//        ArrayList<Integer> list = genericInterface2.list()

    }
    public static double sumMethod(){
        SomeInterface takesNoParameter = () -> {
            int a = 24;
            int b = 32;

            double c = a + b;
            return c;
        };
        double sum = takesNoParameter.noParameter();
        return sum;
    }


}
