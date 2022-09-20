public class Main {
    public static void main(String[] args) {
        int[] example = {1, 2, 3, 4, 0, 7, 7};

        SalesManager sales = new SalesManager(example);

        int maxSales = sales.max();
        System.out.println("Max of Sales: " + maxSales);

    }
}
