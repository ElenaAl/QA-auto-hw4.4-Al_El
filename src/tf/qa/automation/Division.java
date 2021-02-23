package tf.qa.automation;

public class Division extends Operation {

    @Override
    public String execute(int j, int i) {
        int x=j/i;
        return "результат деления a/b= "+ x;
    }
}

