package cn.ponytech.shop.order.controller;

import cn.ponytech.shop.order.pojo.Order;
import cn.ponytech.shop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/order/{orderId}")
    public Order getOrderById(@PathVariable("orderId")String orderId){
        return orderService.getOrderById(orderId);
    }
}
