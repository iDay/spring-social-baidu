/**
 * 
 */
package org.springframework.social.baidu.api;

import java.io.Serializable;

/**
 * @author iDay
 * 
 */
public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2380440274230318816L;
	private long userid;
	private String username;
	private String realname;
	private String portrait;
	private String userdetail;
	private String birthday;
	private String marriage;
	private String sex;
	private String blood;
	private String figure;
	private String constellation;
	private String education;
	private String trade;
	private String job;

	public UserDetails(long userid, String username, String realname,
			String portrait, String userdetail, String birthday,
			String marriage, String sex, String blood, String figure,
			String constellation, String education, String trade, String job) {
		super();
		this.userid = userid;
		this.username = username;
		this.realname = realname;
		this.portrait = portrait;
		this.userdetail = userdetail;
		this.birthday = birthday;
		this.marriage = marriage;
		this.sex = sex;
		this.blood = blood;
		this.figure = figure;
		this.constellation = constellation;
		this.education = education;
		this.trade = trade;
		this.job = job;
	}

	/**
	 * @return the userid
	 */
	public long getUserid() {
		return userid;
	}

	/**
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(long userid) {
		this.userid = userid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * @param realname
	 *            the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * @return the portrait
	 */
	public String getPortrait() {
		return portrait;
	}

	/**
	 * @param portrait
	 *            the portrait to set
	 */
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	/**
	 * @return the userdetail
	 */
	public String getUserdetail() {
		return userdetail;
	}

	/**
	 * @param userdetail
	 *            the userdetail to set
	 */
	public void setUserdetail(String userdetail) {
		this.userdetail = userdetail;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the marriage
	 */
	public String getMarriage() {
		return marriage;
	}

	/**
	 * @param marriage
	 *            the marriage to set
	 */
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the blood
	 */
	public String getBlood() {
		return blood;
	}

	/**
	 * @param blood
	 *            the blood to set
	 */
	public void setBlood(String blood) {
		this.blood = blood;
	}

	/**
	 * @return the figure
	 */
	public String getFigure() {
		return figure;
	}

	/**
	 * @param figure
	 *            the figure to set
	 */
	public void setFigure(String figure) {
		this.figure = figure;
	}

	/**
	 * @return the constellation
	 */
	public String getConstellation() {
		return constellation;
	}

	/**
	 * @param constellation
	 *            the constellation to set
	 */
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education
	 *            the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @return the trade
	 */
	public String getTrade() {
		return trade;
	}

	/**
	 * @param trade
	 *            the trade to set
	 */
	public void setTrade(String trade) {
		this.trade = trade;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

}
