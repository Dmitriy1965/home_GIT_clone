public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }


    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat() {
     //   int min = sales[0];
        int stat = 0;
        for (int sale : sales) {
                stat = sale + stat;
          }
        stat = (stat - max() - min()) / (sales.length - 2);
        return stat;
    }



}

