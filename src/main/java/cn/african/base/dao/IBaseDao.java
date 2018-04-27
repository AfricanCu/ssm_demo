package cn.african.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IBaseDao<E extends Serializable> {
	
	@SuppressWarnings("rawtypes")
	List queryBySQL(@Param("table") String table, 
					@Param("fields") List<String> fields, 
					@Param("wheres") Map wheres,
					@Param("begin") Integer begin,
					@Param("end") Integer end, 
					@Param("order") String order);
	
	
	
}
