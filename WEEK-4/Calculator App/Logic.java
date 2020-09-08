package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {

    private static final int Addition = 1;
    private static final int Subtraction = 2;
    private static final int Multiplication = 3;
    private static final int Division = 4;

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }


    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        if(operation==Addition){
            Add add = new Add(argumentOne,argumentTwo);
            mOut.print(add.toString());
        }
        else if(operation==Subtraction){
            Subtract sub = new Subtract(argumentOne,argumentTwo);
            mOut.print(sub.toString());
        }
        else if(operation==Multiplication){
            Multiply mul = new Multiply(argumentOne,argumentTwo);
            mOut.print(mul.toString());
        }
        else{
            Divide div = new Divide(argumentOne,argumentTwo);
            mOut.print(div.toString());
        }
    }
}
