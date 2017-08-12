package com.jingdon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jingdon.pojo.TbItem;
import com.jingdon.service.TBItemService;
@RestController
public class ItemController {
@Autowired
private TBItemService itemservice;


@RequestMapping("/item/{id}")
public TbItem getItemById(@PathVariable Long id){
	return itemservice.getTBItemById(id);
}
}
