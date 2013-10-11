/**
 * 
 */
package org.springframework.social.baidu.api;

import java.io.Serializable;

/**
 * @author iDay
 * 
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4714384801123092809L;

	private long uid;
	private String uname;
	private String portrait;

	public User(long uid, String uname, String portrait) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.portrait = portrait;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

}
