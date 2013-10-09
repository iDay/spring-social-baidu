/**
 * 
 */
package org.springframework.social.baidu.connect;

import org.springframework.social.baidu.api.Baidu;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.oauth2.OAuth2ServiceProvider;

/**
 * @author iDay
 * 
 */
public class BaiduConnectionFactory extends OAuth2ConnectionFactory<Baidu> {

	public BaiduConnectionFactory(String providerId,
			OAuth2ServiceProvider<Baidu> serviceProvider,
			ApiAdapter<Baidu> apiAdapter) {
		super(providerId, serviceProvider, apiAdapter);
		// TODO Auto-generated constructor stub
	}

	public BaiduConnectionFactory(String clientId, String clientSecret) {
		super("baidu", new BaiduServiceProvider(clientId, clientSecret),
				new BaiduAdapter());
	}

}
