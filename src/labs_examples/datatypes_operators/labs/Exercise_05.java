package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;

        if (a | b){
            System.out.println("a or b is true");
        }
        //b = false, therefore a & b is a false statement
        if (a & b){
            System.out.println("a and b is true");
        }
        if (a ^ b){
            System.out.println("a or b can be true but not both (XOR - One can be true but not both)");
        }
        if (a || b){
            System.out.println("a (short circuit OR) b is true");
        }
        if (a != b){
            System.out.println("a is not b");
        }
    }

}

