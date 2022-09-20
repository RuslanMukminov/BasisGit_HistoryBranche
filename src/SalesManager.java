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

    public int trimAverage() {
        int max = -1;
        int sum = 0;
        int min = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            } else if (sale < min) {
                min = sale;
            }
            sum += sale;
        }
        return (sum - max - min) / (sales.length - 2);
    }
}
