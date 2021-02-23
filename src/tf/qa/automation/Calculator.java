package tf.qa.automation;
import java.util.Scanner;

/*Задание. Реализовать калькулятор.
В рамках задачи должен быть создан класс-родитель Operation с методом execute.
От родителя должны наследоваться его наследники (минимум четыре, +, -, \, *)
В каждом из наследников переопределяется метод execute и выполняет действия, которые свойственны наследнику.
*/

public class Calculator{

    public static void main(String[] args) {
        boolean exit = true;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                exit = false;
                System.out.println("Введите выражение, которое нужно вычислить в формате a+b. Допустимо не более 2 переменных. " +
                        "\nВведите первую целочисленную переменную, затем нажмите Enter." +
                        "\nЗатем введите знак операции и снова нажмите Enter. (Допустимые операции для нашего маленького калькулятора: сложение(+), вычитание(-)," +
                        "\nделение(/), умножение(*))" +
                        "\nЗатем введите вторую целочисленную переменную и нажмите Enter.");

                int a = sc.nextInt();

                String operand = sc.next();
                while (!(operand.equals("-") || operand.equals("+") || operand.equals("/") || operand.equals("*"))) {
                    System.out.println("Вы ввели неверный знак операции. Допустимые операции для нашего маленького калькулятора: сложение(+), вычитание(-),деление(/), умножение(*)");
                    operand = sc.next();
                }
                int b= sc.nextInt();

                if (operand.equals("+")) {
                    Sum sum = new Sum();
                    System.out.println(sum.execute(a, b));
                } else {
                    if (operand.equals("/")) {
                        if (b == 0) {
                            System.out.println("Деление на 0 невозможно");
                        }
                        else {
                            Division div = new Division();
                            System.out.println(div.execute(a, b));
                        }
                    } else {
                        if (operand.equals("-")) {
                            Deduction deduct = new Deduction();
                            System.out.println(deduct.execute(a, b));
                        } else {
                            if (operand.equals("*")) {
                                Multiplication multiple = new Multiplication();
                                System.out.println(multiple.execute(a, b));
                            } else {
                                System.out.println("Извините, мы не смогли посчитать. Проверьте, пожалуйста, введенные данные, возможно была допущена ошибка.");
                            }
                        }
                    }
                }

                System.out.println("Хотите выйти? (да/нет)");
                String ex = sc.next();

                if (ex.equals("да")) {
                    exit = true;
                    sc.close();
                } else {
                    if (ex.equals("нет")) {
                       exit = false;
                    }
                }

        } while (!exit) ;
    }
        catch (Exception input){
            System.out.println("кажется вы ввели неверные данные и потребуется запустить программу заново.");
        }
    }
 }
