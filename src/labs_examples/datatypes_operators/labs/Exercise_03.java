package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int a = 14;
        int s = 12;
        int mu = 10;
        int d = 15;
        int mo = 17;
        a += 5;
        s -= 6;
        mu *= 7;
        d /= 8;
        mo %= 9;

        System.out.println("a = " + a);
        System.out.println("s = " + s);
        System.out.println("mu = " + mu);
        System.out.println("d + " + d);
        System.out.println("mo = " + mo);

        //OR

        int add = 1 + 2;
        int sub= 2 - 3;
        int mul = 3 * 4;
        int div = 5 / 6;
        int mod = 7 % 8;

        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);

    }

}
