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
abstract class UserInfoMixin {

	@JsonCreator
	public UserInfoMixin(@JsonProperty("userid") long userid,
			@JsonProperty("username") String username,
			@JsonProperty("realname") String realname,
			@JsonProperty("portrait") String portrait,
			@JsonProperty("userdetail") String userdetail,
			@JsonProperty("birthday") String birthday,
			@JsonProperty("marriage") String marriage,
			@JsonProperty("sex") String sex,
			@JsonProperty("blood") String blood,
			@JsonProperty("figure") String figure,
			@JsonProperty("constellation") String constellation,
			@JsonProperty("education") String education,
			@JsonProperty("trade") String trade, @JsonProperty("job") String job) {
	}
}
