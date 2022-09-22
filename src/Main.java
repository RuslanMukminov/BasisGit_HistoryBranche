public class Main {
    public static void main(String[] args) {
        long[] example = {1, 2, 3, 4, 1, 7, 7};

        SalesManager sales = new SalesManager(example);

        long maxSales = sales.max();
        System.out.println("Max of Sales: " + maxSales);

        long trimAverage = sales.trimAverage();
        System.out.println("Trimmed average: " + trimAverage);
    }
}
