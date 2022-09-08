package atlesson2.git;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(String.format("2 + 4 = %d", calculator.sum(2, 4)));
        System.out.println(String.format("6 - 8 = %f", calculator.substract(6, 8)));
        System.out.println(String.format("2^ 10 = %f", calculator.power(2,6)));

    }

}
