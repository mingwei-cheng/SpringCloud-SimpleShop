package cn.ponytech.shop.order.service;

import cn.ponytech.shop.order.pojo.Item;
import cn.ponytech.shop.order.pojo.Order;
import cn.ponytech.shop.order.pojo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    private static final Map<String,Order> MAP = new HashMap<>();

    @Autowired
    ItemService itemService;

    @Value("${server.port}")
    String port;

    static {
        Order order = new Order();
        order.setOrderId("2312412");
        order.setCreateTime(new Date());
        order.setUpdateTime(order.getCreateTime());
        order.setUserId(1L);
        List<OrderDetail> list = new ArrayList<>();
        Item item = new Item();
        item.setId(1L);
        list.add(new OrderDetail(order.getOrderId(),item));

        item = new Item();
        item.setId(2L);
        list.add(new OrderDetail(order.getOrderId(),item));

        order.setOrderDetails(list);
        MAP.put(order.getOrderId(),order);

    }

    public Order getOrderById(String orderId){
        Order order = MAP.get(orderId);
        if(order==null){
            return null;
        }

        List<OrderDetail> orderDetails = order.getOrderDetails();
        for (OrderDetail orderDetail:orderDetails){
            Item item = itemService.getItemById(orderDetail.getItem().getId());
            if(item==null){
                continue;
            }
            orderDetail.setItem(item);
        }
        return order;
    }
}
