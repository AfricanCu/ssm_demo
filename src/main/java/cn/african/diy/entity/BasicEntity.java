package cn.african.diy.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.mingsoft.util.StringUtil;

public class BasicEntity extends cn.african.base.entity.BaseEntity {
	private static final long serialVersionUID = -1914936542567980977L;
	/** 基本实体编号 **/
	private int basicId;
	/** 标题 **/
	private String basicTitle;
	/** 描述 **/
	private String basicDescription;
	/** 缩略图 **/
	private String basicThumbnails;
	/** 缩略图主图 **/
	private String basicPic;
	/** 通用属性 **/
	private String basicType;
	/** 不参加表结构 **/
	private int[] basicTypeIds;
	/** 点击次数 **/
	private int basicHit;
	/** 发布时间 **/
	private Timestamp basicDateTime;
	/** 更新时间 **/
	private Date basicUpdateTime;
	/** 用户编号 **/
	private int basicPeopleId;
	/** 排序 **/
	private int basicSort;
	/** 所属分类编号 **/
	private int basicCategoryId = 0;
	/** 所属应用编号 **/
	private int basicAppId;
	/** 模块编号 **/
	private int basicModelId;
	/** 评论次数 **/
	private int basicComment;
	/** 收藏次数 **/
	private int basicCollect;
	/** 分享次数 **/
	private int basicShare;
	/** 扩展字段 **/
	private Map<String, Object> extendsFields;

	public int getBasicAppId() {
		return basicAppId;
	}

	public void setBasicAppId(int basicAppId) {
		this.basicAppId = basicAppId;
	}

	public int getBasicId() {
		return basicId;
	}

	public void setBasicId(int basicId) {
		this.basicId = basicId;
	}

	public String getBasicTitle() {
		return basicTitle;
	}

	public void setBasicTitle(String basicTitle) {
		this.basicTitle = basicTitle;
	}

	public String getBasicDescription() {
		return basicDescription;
	}

	public void setBasicDescription(String basicDescription) {
		this.basicDescription = basicDescription;
	}

	public String getBasicThumbnails() {
		return basicThumbnails;
	}

	public void setBasicThumbnails(String basicThumbnails) {
		this.basicThumbnails = basicThumbnails;
	}

	public String getBasicPic() {
		if (!StringUtil.isBlank(basicThumbnails)) {
			String[] pics = basicThumbnails.split("\\|");
			return pics[0];
		}
		return "";
	}

	public void setBasicPic(String basicPic) {
		this.basicPic = basicPic;
	}

	public String getBasicType() {
		return basicType;
	}

	public void setBasicType(String basicType) {
		this.basicType = basicType;
	}

	public int[] getBasicTypeIds() {
		if (StringUtil.isBlank(basicType)) {
			return new int[0];
		}
		return StringUtil.stringsToInts(basicType.split(","));
	}

	public void setBasicTypeIds(int[] basicTypeIds) {
		this.basicTypeIds = basicTypeIds;
	}

	public int getBasicHit() {
		return basicHit;
	}

	public void setBasicHit(int basicHit) {
		this.basicHit = basicHit;
	}

	public Timestamp getBasicDateTime() {
		return basicDateTime;
	}

	public void setBasicDateTime(Timestamp basicDateTime) {
		this.basicDateTime = basicDateTime;
	}

	public Date getBasicUpdateTime() {
		return basicUpdateTime;
	}

	public void setBasicUpdateTime(Date basicUpdateTime) {
		this.basicUpdateTime = basicUpdateTime;
	}

	public int getBasicPeopleId() {
		return basicPeopleId;
	}

	public void setBasicPeopleId(int basicPeopleId) {
		this.basicPeopleId = basicPeopleId;
	}

	public int getBasicSort() {
		return basicSort;
	}

	public void setBasicSort(int basicSort) {
		this.basicSort = basicSort;
	}

	public int getBasicCategoryId() {
		return basicCategoryId;
	}

	public void setBasicCategoryId(int basicCategoryId) {
		this.basicCategoryId = basicCategoryId;
	}

	public int getBasicModelId() {
		return basicModelId;
	}

	public void setBasicModelId(int basicModelId) {
		this.basicModelId = basicModelId;
	}

	public int getBasicComment() {
		return basicComment;
	}

	public void setBasicComment(int basicComment) {
		this.basicComment = basicComment;
	}

	public int getBasicCollect() {
		return basicCollect;
	}

	public void setBasicCollect(int basicCollect) {
		this.basicCollect = basicCollect;
	}

	public int getBasicShare() {
		return basicShare;
	}

	public void setBasicShare(int basicShare) {
		this.basicShare = basicShare;
	}

	public Map<String, Object> getExtendsFields() {
		return extendsFields;
	}

	public void setExtendsFields(Map<String, Object> extendsFields) {
		this.extendsFields = extendsFields;
	}

	@Override
	public String toString() {
		return "BasicEntity [basicId=" + basicId + ", basicTitle=" + basicTitle + ", basicDescription="
				+ basicDescription + ", basicThumbnails=" + basicThumbnails + ", basicPic=" + basicPic + ", basicType="
				+ basicType + ", basicTypeIds=" + Arrays.toString(basicTypeIds) + ", basicHit=" + basicHit
				+ ", basicDateTime=" + basicDateTime + ", basicUpdateTime=" + basicUpdateTime + ", basicPeopleId="
				+ basicPeopleId + ", basicSort=" + basicSort + ", basicCategoryId=" + basicCategoryId + ", basicAppId="
				+ basicAppId + ", basicModelId=" + basicModelId + ", basicComment=" + basicComment + ", basicCollect="
				+ basicCollect + ", basicShare=" + basicShare + ", extendsFields=" + extendsFields + "]";
	}

}
