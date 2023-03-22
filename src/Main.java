public class Main {
    public static void main(String[] args) {

        long[] sales = {100, 300, 200};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);
    }
}
