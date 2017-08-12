package com.jingdon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jingdon.mapper.TbItemMapper;
import com.jingdon.pojo.TbItem;
import com.jingdon.pojo.TbItemExample;
import com.jingdon.pojo.TbItemExample.Criteria;
import com.jingdon.service.TBItemService;
@Service
public class TBItemServiceImpl implements TBItemService{

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem getTBItemById(Long id) {
		TbItem item=null;
		//1 使用主键直接查询
		item=tbItemMapper.selectByPrimaryKey(id);
		//2 使用example查询
		/*TbItemExample example=new TbItemExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(id);
		List<TbItem> result=tbItemMapper.selectByExample(example);
		if(result!=null&&result.size()>0){
			item=result.get(0);
		}*/
		//使用主键直接查询
		return item;
	}

}
