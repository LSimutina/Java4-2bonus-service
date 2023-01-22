public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long expected = 30; // задаем ожидаемое значение
        long actual = service.calculate(amount, registered); // вызов целевого метода
        boolean passed = expected == actual; // сравниваем ожидаемый и фактический результат
        System.out.println(passed);

    }
}

