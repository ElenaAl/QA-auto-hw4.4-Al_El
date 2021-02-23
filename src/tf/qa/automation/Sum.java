package tf.qa.automation;

class Sum extends Operation {

    @Override
    public String execute(int j, int i) {
        int x=j+i;
        return "результат сложения a+b= "+ x;
 }

}
