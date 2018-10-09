package cn.ponytech.shop.item.controller;

import cn.ponytech.shop.item.pojo.Item;
import cn.ponytech.shop.item.service.ItemService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/item/{id}")
    public Item getItemById(@PathVariable("id") Long id){
            return itemService.getItemById(id);
    }


}
