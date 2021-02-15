package cn.jiyun.feign;

import cn.jiyun.pojo.TbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "usian-item-service")
public interface ItemServiceFeign {

    @RequestMapping("/service/item/selectItemInfo")
    TbItem selectItemInfo(@RequestParam("itemId") Long itemId);
}