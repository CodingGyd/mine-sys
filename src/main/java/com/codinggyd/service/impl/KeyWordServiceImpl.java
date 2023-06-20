package com.codinggyd.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.codinggyd.bean.KeyWord;
import com.codinggyd.mapper.KeyWordMapper;
import com.codinggyd.service.IKeyWordService;

/**
 * 
 * @Title:  KeyWordServiceImpl.java
 * @Package: com.codinggyd.service.impl
 * @Description: 
 *
 * @author: guoyd
 * @Date: 2017年11月5日 上午11:43:03
 *
 * Copyright @ 2017 Corpration Name
 */
@Service
@Transactional(value="mineTransactionManager",propagation=Propagation.NOT_SUPPORTED,readOnly=true)
public class KeyWordServiceImpl implements IKeyWordService{

	final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private KeyWordMapper mapper;
	@Override
	public List<KeyWord> getKeyWords(List<Integer> ids) {
		return mapper.findKeywords(ids);
	}
	@Override
	@Transactional(value="mineTransactionManager",propagation=Propagation.REQUIRED,readOnly=false)
	public void deleteKeyWords(Integer id) {
		mapper.deleteKeyWord(id);
	}
	@Override
	@Transactional(value="mineTransactionManager",propagation=Propagation.REQUIRED,readOnly=false)
	public void updateKeyWords(KeyWord key) {
		mapper.updateKeyWords(key);
	}
	@Override
	@Transactional(value="mineTransactionManager",propagation=Propagation.REQUIRED,readOnly=false)
	public void insertKeyWords(KeyWord key) {
		mapper.insertKeyWords(key);
	}
	@Override
	public KeyWord queryKeyWords(Integer id) {
 		return mapper.queryKeyWords(id);
	}
}
