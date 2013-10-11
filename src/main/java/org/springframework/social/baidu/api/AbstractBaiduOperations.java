/**
 * 
 */
package org.springframework.social.baidu.api;

import java.net.URI;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author iday
 * 
 */
public class AbstractBaiduOperations extends AbstractOAuth2ApiBinding {

	protected static final String API_URL = "https://openapi.baidu.com/rest/2.0/";

	private final boolean isAuthorized;
	protected final RestTemplate restTemplate;
	protected final Baidu api;

	public AbstractBaiduOperations(Baidu api, RestTemplate restTemplate,
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

	protected URI buildUrl(String url) {
		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("access_token", this.api.getAccessToken());
		return buildUrl(url, params);
	}

	protected URI buildUrl(String url, MultiValueMap<String, String> parameters) {
		parameters.add("access_token", this.api.getAccessToken());
		return URIBuilder.fromUri(API_URL + url).queryParams(parameters)
				.build();
	}

	protected URI buildUrl(String url, String name, String value) {
		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("access_token", this.api.getAccessToken());
		params.add(name, value);
		return URIBuilder.fromUri(API_URL + url).queryParams(params)
				.build();
	}

}
