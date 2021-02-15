package cn.jiyun.app.service;

import cn.jiyun.mapper.TbItemMapper;
import cn.jiyun.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemService{

	@Autowired
	private TbItemMapper tbItemMapper;

	public TbItem selectItemInfo(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}
}