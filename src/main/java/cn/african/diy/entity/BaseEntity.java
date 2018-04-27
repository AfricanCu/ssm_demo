package cn.african.diy.entity;

public class BaseEntity extends cn.african.base.entity.BaseEntity {
	private static final long serialVersionUID = 230793267702458551L;

	private int appId;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	@Override
	public String toString() {
		return "BaseEntity [appId=" + appId + "]";
	}
}
