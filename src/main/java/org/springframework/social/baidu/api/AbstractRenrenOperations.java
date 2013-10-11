/**
 * 
 */
package org.springframework.social.baidu.api;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;

/**
 * @author iday
 * 
 */
public class AbstractRenrenOperations extends AbstractOAuth2ApiBinding {

	protected static final String API_URL = "https://openapi.baidu.com/rest/2.0/";

	private final boolean isAuthorized;
	protected final RestTemplate restTemplate;
	protected final Baidu api;

	public AbstractRenrenOperations(Baidu api, RestTemplate restTemplate,
			boolean isAuthorized) {
		this.api = api;
		this.restTemplate = restTemplate;
		this.isAuthorized = isAuthorized;
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}
	

}
