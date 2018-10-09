package cn.ponytech.shop.order.pojo;

public class OrderDetail {

    String orderId;
    Item item = new Item();

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
    public OrderDetail(){

    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", item=" + item +
                '}';
    }
}
