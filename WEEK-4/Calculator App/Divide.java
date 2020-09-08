package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    private int argOne = 0;
    private int argTwo = 0;
    private int quotient = 0;
    private int remainder = 0;

    public Divide(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString(){
        //Checking value in box2 is 0 or not

        if(argTwo !=0) {
            quotient = argOne / argTwo;
            remainder = argOne % argTwo;
            return String.valueOf(quotient + " R: " + remainder);
        }
        else
            return String.valueOf("Division by 0 not allowed");
    }
}
