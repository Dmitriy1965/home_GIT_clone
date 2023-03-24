public class Main {
    public static void main(String[] args) {

        long[] sales = {100, 300, 200};
        SalesManager salesManager = new SalesManager(sales);

        long min = salesManager.min();
        long stat = salesManager.stat();
        long max = salesManager.max();

        System.out.println(max);
        System.out.println(min);
        System.out.println(stat);

    }
}
