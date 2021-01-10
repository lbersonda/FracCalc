
public class FracCalc2 {


    public static void main(String[] args) {

        produceAnswer("1/2 + 1/4");


    }
    public static String produceAnswer(String input) {

        String frac1 = input.substring(0, input.indexOf(" "));

        String operand = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2);

        String frac2 = input.substring(input.indexOf(" ") + 3);


        String firstWhole = Whole(frac1);

        String firstNum = Num(frac1);

        String firstDeno = Deno(frac1);


        String secWhole = Whole(frac2);

        String secNum = Num(frac2);

        String secDeno = Deno(frac2);


        String Result = "whole:" + secWhole + " numerator:" + secNum + " denominator:" + secDeno;


        return calculate(input);

    }


    public static String Whole(String input) {

        if (input.contains("_")) {

            return input.substring(0, input.indexOf("_"));

        } else if (input.contains("/")) {

            return "0";

        } else

            return input;

    }


    public static String Num(String input) {

        if (input.contains("_")) {

            return input.substring(input.indexOf("_") + 1, input.indexOf("/"));

        } else if (input.contains("/")) {

            return input.substring(0, input.indexOf("/"));

        } else

            return "0";

    }


    public static String Deno(String input) {

        if (input.contains("/")) {

            return input.substring(input.indexOf("/") + 1);

        } else

            return "1";

    }


    public static String calculate(String input) {

        String frac1 = input.substring(0, input.indexOf(" "));

        String operand = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2);

        String frac2 = input.substring(input.indexOf(" ") + 3);


        String firstWhole = Whole(frac1);

        String firstNum = Num(frac1);

        String firstDeno = Deno(frac1);


        String secWhole = Whole(frac2);

        String secNum = Num(frac2);

        String secDeno = Deno(frac2);


        int whole1 = Integer.parseInt(firstWhole);

        int num1 = Integer.parseInt(firstNum);

        int deno1 = Integer.parseInt(firstDeno);

        int numerator1 = ((whole1 * deno1));

        if (numerator1 < 0) {

            num1 = -num1;

        }

        int idk = numerator1 + num1;


        int whole2 = Integer.parseInt(secWhole);

        int num2 = Integer.parseInt(secNum);

        int deno2 = Integer.parseInt(secDeno);

        int numerator2 = ((whole2 * deno2)); 

        if (numerator2 < 0) {

            num2 = -num2;

        }

        int yup = numerator2 + num2;


        if (operand.contains("+")) {

            int numer = ((idk * deno2) + (yup * deno1));

            int denom = (deno1 * deno2);

            String answer = numer + "/" + denom;

            return simplify(numer, denom);


        } else if (operand.contains("-")) {

            int numer = ((idk * deno2) - (yup * deno1));

            int denom = (deno1 * deno2);

            String answer = numer + "/" + denom;

            return simplify(numer, denom);


        } else if (operand.contains("*")) {

            int numer = ((idk * yup));

            int denom = (deno1 * deno2);

            String answer = numer + "/" + denom;

            return simplify(numer, denom);


        } else if (operand.contains("/")) {

            int numer = ((idk * deno2));

            int denom = (deno1 * yup);

            String answer = numer + "/" + denom;

            return simplify(numer, denom);

        } else

            return input;

    }


    public static String simplify(int a, int b) {

        int whole = a / b;

        int numerator = a % b;

        int denominator = b;

        int largest;

        if (numerator > denominator) {

            largest = numerator;

        }

        else largest = denominator; 

            for (int i = largest; i >= 2; i--) {

                if (numerator % i == 0 && denominator % i == 0) {

                    numerator = numerator / i;

                    denominator = denominator / i;

                }

            }

            if (numerator%3 == 0 && denominator %3 ==0) {

                numerator=numerator/3;

                denominator = denominator/3;

            }

            if (numerator < 0 && !(whole == 0)) {

                numerator = -numerator;

            }

            if (denominator < 0 && !(whole == 0)) {

                denominator = -denominator;

            }

            if (denominator < 0 && numerator > 0) {

                denominator = -denominator;

                numerator = -numerator;

            }

        if (numerator == 0) {

            return whole + "";

        }

        if (denominator == 1) {

            return "" + numerator;

        }

        if (whole == 0) {

            return numerator + "/" + denominator;

        }


        return whole + "_" + numerator + "/" + denominator;


    }


}
    
    
    