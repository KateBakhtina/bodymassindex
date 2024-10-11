public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int result = service.calculate(weight, height);
        System.out.println("Индекс массы тела равен: " + result);

    }
}
