package labs_examples.Bali_InPerson_MarApr2020.Past.Day4_Thurs_Mar_5.Lambda.Practice;

import java.util.Collection;

@FunctionalInterface
interface SomeInterface {
    public double noParameter();
}

interface SomeInterface2 {
    double TwoParameter(Double b, Double c);
}
interface SomeInterface3 {
    Boolean trueOrFalse(Integer val1);
}
interface GenericInterface <S, T, O> {
   S convert(T val1, O val2);
}
interface GenArrlistInterface <C extends Collection, T extends Number> {
    C list(T[] element);
}
