/**
 * 
 */
package org.springframework.social.baidu.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author iDay
 * 
 */
public class Baidu extends AbstractOAuth2ApiBinding implements ApiBinding {
	private String accessToken;

	public Baidu() {
		super();
	}

	public Baidu(String accessToken) {
		super(accessToken);
		this.accessToken = accessToken;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

}
