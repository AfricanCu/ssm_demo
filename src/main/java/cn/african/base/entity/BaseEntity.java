package cn.african.base.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlTransient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 4692753233454827678L;
	/** 实体编号（唯一标识） **/
	protected String id;
	/** 备注 **/
	protected String remarks;
	/** 创建用户编号 **/
	@JsonIgnore
	@XmlTransient
	protected int createBy;
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	protected Date createDate;
	/** 最后更新用户编号 **/
	@JsonIgnore
	@XmlTransient
	protected int updateBy;
	/** 最后更新日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	protected Date updateDate;
	/** 标记 **/
	@JsonIgnore
	@XmlTransient
	protected int delFlag;
	/** 自定义sql的where条件 **/
	@JsonIgnore
	@XmlTransient
	protected String sqlWhere;
	/** 自定义sql的where条件 **/
	@JsonIgnore
	@XmlTransient
	protected String sqlDataScope;
	/** 排序字段 **/
	@JsonIgnore
	@XmlTransient
	protected String orderBy;
	/** 排序方式 **/
	protected String order;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

	@JsonIgnore
	@XmlTransient
	public String getSqlWhere() {
		return sqlWhere;
	}

	public void setSqlWhere(String sqlWhere) {
		this.sqlWhere = sqlWhere;
	}

	public String getSqlDataScope() {
		return sqlDataScope;
	}

	public void setSqlDataScope(String sqlDataScope) {
		this.sqlDataScope = sqlDataScope;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", remarks=" + remarks + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + ", delFlag=" + delFlag + ", sqlWhere="
				+ sqlWhere + ", sqlDataScope=" + sqlDataScope + ", orderBy=" + orderBy + ", order=" + order + "]";
	}
}
