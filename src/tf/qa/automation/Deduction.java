package tf.qa.automation;

public class Deduction extends Operation{

    @Override
    public String execute(int j, int i) {
        int x=j-i;
        return "результат вычитания a-b= "+ x;
    }
}
