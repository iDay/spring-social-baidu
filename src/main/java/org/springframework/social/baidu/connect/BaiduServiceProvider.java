/**
 * 
 */
package org.springframework.social.baidu.connect;

import org.springframework.social.baidu.api.Baidu;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author iDay
 *
 */
public class BaiduServiceProvider extends AbstractOAuth2ServiceProvider<Baidu> {

	/**
	 * @param clientId
	 * @param clientSecret
	 */
	public BaiduServiceProvider(String clientId, String clientSecret) {
		super(new OAuth2Template(clientId, clientSecret,
				"https://openapi.baidu.com/oauth/2.0/authorize",
				"https://openapi.baidu.com/oauth/2.0/token"));
	}

	@Override
	public Baidu getApi(String accessToken) {
		return new Baidu(accessToken);
	}

}
