package hello.core.order;

public interface OrderService {

    /**
     * Create order order.
     *
     * @param memberId  the member id
     * @param itemName  the item name
     * @param itemPrice the item price
     * @return the order
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
