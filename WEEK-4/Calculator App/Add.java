package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    private int argOne = 0;
    private int argTwo = 0;
    private int sum = 0;

    // TODO -- start your code here
    public Add(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;

    }
    public String toString(){
        sum = argOne + argTwo;
        return String.valueOf(sum);
    }
}
