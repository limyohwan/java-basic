package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("두부", 3000, 15);
        Item item2 = new Item("토마토", 2100, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
