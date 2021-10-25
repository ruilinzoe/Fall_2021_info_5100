package assignment3Part2;

public class Context {
    MathOperation moperation; // declaring object, field.
    public Context(MathOperation operation) {
        //file, //parameter value
        this.moperation = operation;//assign value
    }
    public int execute(int num1, int num2) {
// Implement your code here
        return moperation.performOperation(num1,num2);
    }
}