public class Main {
    public static void main(String[] args) {

        int[] sales = {100, 300, 200};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        int min = salesManager.min();
        int stat = salesManager.stat();

        System.out.println(max);
        System.out.println(min);
        System.out.println(stat);

    }
}
