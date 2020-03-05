package labs_examples.Bali_InPerson_MarApr2020.Day4_Thurs_Mar_5.Lambda.Practice;

import java.util.Collection;

@FunctionalInterface
interface SomeInterface {
    public double noParameter();
}

interface SomeInterface2 {
    double TwoParameter(Double b, Double c);
}
interface ThreeParameter {
    void ThreeParameter(Double val1, Float val2, String val3);
}
interface GenericInterface <S, T, O> {
    <S, T, O> void convert(S val, T val1, O val2);
}
interface GenericArraylistInterface <C extends Collection> {
    <C> void list(C listName);
}
