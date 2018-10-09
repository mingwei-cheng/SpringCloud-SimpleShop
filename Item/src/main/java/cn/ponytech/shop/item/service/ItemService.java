package cn.ponytech.shop.item.service;

import cn.ponytech.shop.item.pojo.Item;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class ItemService {

    private static final Map<Long,Item> MAP = new HashMap<Long, Item>();

    @Value("${server.port}")
    String port;

    @Value("${item1}")
    String item1;
    @Value("${item2}")
    String item2;
    @Value("${item3}")
    String item3;
    @Value("${item4}")
    String item4;


    public Item getItemById(Long id){
        try {
            MAP.put(1L,JSON.toJavaObject(JSON.parseObject(item1),Item.class));
            MAP.put(2L,JSON.toJavaObject(JSON.parseObject(item2),Item.class));
            MAP.put(3L,JSON.toJavaObject(JSON.parseObject(item3),Item.class));
            MAP.put(4L,JSON.toJavaObject(JSON.parseObject(item4),Item.class));
        }catch (Exception ex){

            Logger.logMsg(1,ex.getMessage());
        }

        MAP.get(id).setPort(port);
        return  MAP.get(id);
    }

}
