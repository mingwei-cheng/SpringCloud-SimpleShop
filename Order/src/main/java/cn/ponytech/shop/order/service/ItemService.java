package cn.ponytech.shop.order.service;

import cn.ponytech.shop.order.pojo.Item;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

//    @HystrixCommand(fallbackMethod = "getItemByIdError")
    public Item getItemById(Long id) {
        String serviceId = "item-service";
        return restTemplate.getForObject("http://"+serviceId+"/item/"+id,Item.class);
    }

    public Item getItemByIdError(Long id){
        return new Item(null,"调用服务出错！","","",null,"");
    }
}
