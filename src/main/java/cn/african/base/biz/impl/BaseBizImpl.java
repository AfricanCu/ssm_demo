package cn.african.base.biz.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.african.base.biz.IBaseBiz;
import cn.african.base.dao.IBaseDao;

public abstract class BaseBizImpl<E extends Serializable> implements IBaseBiz {

	protected final Logger LOG = LoggerFactory.getLogger(this.getClass());

	protected abstract IBaseDao<E> getDao();

	@SuppressWarnings("rawtypes")
	@Override
	public List queryBySQL(String table, List<String> fields, Map wheres, Integer begin, Integer end) {
		LOG.info("talbe -> {}, fields -> {}, wheres -> {}, begin -> {}, end -> {}", table, fields, wheres, begin, end);
		return getDao().queryBySQL(table, fields, wheres, begin, end, null);
	}
}