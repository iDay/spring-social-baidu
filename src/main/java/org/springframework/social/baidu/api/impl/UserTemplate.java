/**
 * 
 */
package org.springframework.social.baidu.api.impl;

import org.springframework.social.baidu.api.AbstractBaiduOperations;
import org.springframework.social.baidu.api.Baidu;
import org.springframework.social.baidu.api.User;
import org.springframework.social.baidu.api.UserInfo;
import org.springframework.social.baidu.api.UserOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author iDay
 * 
 */
public class UserTemplate extends AbstractBaiduOperations implements
		UserOperations {

	public UserTemplate(Baidu api, RestTemplate restTemplate,
			boolean isAuthorized) {
		super(api, restTemplate, isAuthorized);
	}

	public User getLoggedInUser() {
		requireAuthorization();
		return this.restTemplate.getForObject(
				this.buildUrl("passport/users/getLoggedInUser"), User.class);
	}

	public UserInfo getInfo(long uid, String fields) {
		requireAuthorization();
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("uid", String.valueOf(uid));
		params.add("fields", fields);
		return this.restTemplate.getForObject(
				this.buildUrl("passport/users/getInfo", params),
				UserInfo.class);
	}

	public UserInfo getInfo(long uid) {
		return getInfo(
				uid,
				"portrait,userdetail,birthday,marriage,sex,blood,figure,constellation,education");
	}

}
