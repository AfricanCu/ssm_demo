package cn.african.base.biz;

import java.util.List;
import java.util.Map;

public interface IBaseBiz {
	
	@SuppressWarnings("rawtypes")
	List queryBySQL(String table, List<String> fields, Map wheres, Integer begin, Integer end);
}
