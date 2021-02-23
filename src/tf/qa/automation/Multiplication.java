package tf.qa.automation;

public class Multiplication extends Operation{

    @Override
    public String execute(int j, int i) {
        int x=j*i;
        return "результат умножения a*b= "+ x;
    }

}
