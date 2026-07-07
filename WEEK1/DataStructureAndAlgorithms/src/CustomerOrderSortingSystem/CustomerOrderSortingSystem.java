package CustomerOrderSortingSystem;

public class CustomerOrderSortingSystem {

    public static void main(String[] args) {
        int[] orders = {450, 120, 780, 340, 560};

        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - 1 - i; j++) {
                if (orders[j] > orders[j + 1]) {
                    int temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Order Amounts:");
        for (int order : orders) {
            System.out.println(order);
        }
    }
}