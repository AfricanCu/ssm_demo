package cn.african.base.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mingsoft.util.StringUtil;

public abstract class BaseAction {
	protected final Logger LOG = LoggerFactory.getLogger(this.getClass());
	/**页码**/
	private final String PAGE_NO = "pageNo";
	/**每页显示数量**/
	private final String PAGE_SIZE = "pageSize";
	/**管理基础路径**/
	@Value("${managerPath}")
	protected String managerPath;
	
	/**
	 * 通过spring的webapplicationcontext上下文对象读取bean对象
	 * @param sc
	 * @param beanName
	 * @return
	 */
	protected Object getBean(ServletContext sc, String beanName) {
		return WebApplicationContextUtils.getWebApplicationContext(sc).getBean(beanName);
	}
	
	/**
	 * 获取当前的页码
	 * @param request
	 * @return
	 */
	protected Integer getPageNo(HttpServletRequest request) {
		return this.getInt(request, PAGE_NO, 1);
	}
	
	/**
	 * 默认每页显示10条
	 * @param request
	 * @return
	 */
	protected Integer getPageSize(HttpServletRequest request) {
		return this.getPageSize(request, 10);
	}
	
	/**
	 * 指定每页显示pageSize条
	 * @param request
	 * @param pageSize
	 * @return
	 */
	protected Integer getPageSize(HttpServletRequest request, int pageSize) {
		return this.getInt(request, PAGE_SIZE, pageSize);
	}
	
	/**
	 * 获取整型值
	 * @param request HttpServletRequest对象
	 * @param param 参数名称
	 * @param def 默认值，如果参数param不存在或不符合规则就使用该def做默认值
	 * @return
	 */
	protected Integer getInt(HttpServletRequest request, String param, int def) {
		String value = request.getParameter(param);
		if (StringUtil.isInteger(value)) {
			return Integer.parseInt(value);
		} else {
			return def;
		}
	}
	
	/**
	 * 获取整型值
	 * @param request
	 * @param param
	 * @return 返回整型值，如果request中没有找到则返回空
	 */
	protected Integer getInt(HttpServletRequest request, String param) {
		String value = request.getParameter("param");
		if(StringUtil.isInteger(value)) {
			return Integer.parseInt(value);
		}else {
			return 0;
		}
	}
	

}
