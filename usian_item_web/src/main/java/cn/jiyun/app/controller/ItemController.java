package cn.jiyun.app.controller;

import cn.jiyun.feign.ItemServiceFeign;
import cn.jiyun.pojo.TbItem;
import cn.jiyun.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backend/item")
public class ItemController {
    @Autowired
    private ItemServiceFeign itemServiceFeign;

    /**
     * 查询商品基本信息
     */
    @RequestMapping("/selectItemInfo")
    public Result selectItemInfo(Long itemId) {
        TbItem tbItem = itemServiceFeign.selectItemInfo(itemId);
        if (tbItem != null) {
            return Result.ok(tbItem);
        }
        return Result.error("查无结果");
    }
}