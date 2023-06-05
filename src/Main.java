public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double index = service.calculate(weight, height);
        System.out.println("При весе " + weight + " кг и росте " + height + " м");
        System.out.println("Ваш индекс массы тела составляет: " + index);
    }
}
