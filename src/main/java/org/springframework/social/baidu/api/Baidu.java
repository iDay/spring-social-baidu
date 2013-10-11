/**
 * 
 */
package org.springframework.social.baidu.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.baidu.api.json.BaiduModule;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.social.oauth2.AbstractOAuth2ApiBinding#
	 * configureRestTemplate(org.springframework.web.client.RestTemplate)
	 */
	@Override
	protected void configureRestTemplate(RestTemplate restTemplate) {
		super.configureRestTemplate(restTemplate);
		getJsonMessageConverter().getObjectMapper().registerModule(
				new BaiduModule());
	}

}
