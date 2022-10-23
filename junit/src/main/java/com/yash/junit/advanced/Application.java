/**
 * 
 */
package com.yash.junit.advanced;

/**
 * @author tanay.ojha
 *
 */
public class Application {
		
	private String appId;
	private String appName;
	

	public Application() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param appId
	 * @param appName
	 */
	public Application(String appId, String appName) {
		super();
		this.appId = appId;
		this.appName = appName;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + "]";
	}

}
