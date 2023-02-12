public class Main {
    public static void main(String[] args) {

        int intOperandA = 12;
        int intOperandB = 7;
        int intSum;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 2.2;
        double doubleOperandB = 7.50;
        double doubleSum;
        double doubleProduct;
        double doubleQuotient;
        double doubleModulo;

        //Operations
        intSum = intOperandA + intOperandB;

        System.out.println("The sum using ints of  " + intOperandA + " " + intOperandB +  "  is  " +
                intSum);

        intProduct = intOperandA * intOperandB;

        System.out.println("The product using ints of  " + intOperandA + " " + intOperandB +  "  is  " +
                intProduct);


        intQuotient = intOperandA / intOperandB;

        System.out.println("The quotient using ints of  " + intOperandA + " " + intOperandB +  "  is  " +
                intQuotient);


        intModulo = intOperandA % intOperandB;

        System.out.println("The Remainder using ints of  " + intOperandA + " " + intOperandB +  "  is  " +
                intModulo);


        doubleSum = doubleOperandA + doubleOperandB;

        System.out.println("The Sum using doubles of  " + doubleOperandA + " " + doubleOperandB +  "  is  " +
                doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;

        System.out.println("The Product using doubles of  " + doubleOperandA + " " + doubleOperandB +  "  is  " +
                doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The Quotient using doubles of  " + doubleOperandA + " " + doubleOperandB +  "  is  " +
                doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The Remainder using doubles of  " + doubleOperandA + " " + doubleOperandB +  "  is  " +
                doubleModulo);

        int numKids = 2;
        System.out.println("I have " + numKids + " kids.");
        String rain = "yes";
        System.out.println("The answer to 'is it raining' is " + rain + ".");
        double gasPrice = 3.95;
        System.out.println("The price of gas is " + gasPrice + ".");
        int favNum = 22;
        System.out.println("My favorite number is " + favNum + ".");
        double shoeSize = 9.5;
        System.out.println("My shoe size is " + shoeSize + ".");
        String birthMonth = "July";
        System.out.println("My birth month is " + birthMonth + ".");
        String fullName = "Jacob Johnston";
        System.out.println("My full name is " + fullName + ".");



    }
}