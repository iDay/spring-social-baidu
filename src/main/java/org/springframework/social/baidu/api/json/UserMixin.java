/**
 * 
 */
package org.springframework.social.baidu.api.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author iDay
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class UserMixin {

	@JsonCreator
	public UserMixin(@JsonProperty("uid") long uid,
			@JsonProperty("uname") String uname,
			@JsonProperty("portrait") String portrait) {
	}
}
