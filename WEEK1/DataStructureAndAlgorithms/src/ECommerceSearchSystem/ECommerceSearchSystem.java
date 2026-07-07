package ECommerceSearchSystem;

public class ECommerceSearchSystem {

    public static void main(String[] args) {
        int[] productIds = {101, 203, 405, 506, 708};
        int searchId = 405;
        boolean found = false;

        for (int id : productIds) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product found: " + searchId);
        } else {
            System.out.println("Product not found");
        }
    }
}