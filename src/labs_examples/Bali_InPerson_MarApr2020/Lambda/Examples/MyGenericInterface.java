package labs_examples.Bali_InPerson_MarApr2020.Lambda.Examples;


public class MyGenericInterface {

    public static void main(String[] args) {

        //Integer.parseInt() casts a String to an Integer if the String is a number, if not (a word for example) then it would not be able to cast/execute
        SomeInterface<Double, Integer, String> someName = (Integer i, String s) -> (double) Integer.parseInt(s) + i;
        double pen = someName.calc(7, "7");

        System.out.println(pen);
    }
}

@FunctionalInterface
interface SomeInterface <N,S,J>{
    public N calc (S val1, J val2);
}

