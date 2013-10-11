/**
 * 
 */
package org.springframework.social.baidu.api;

/**
 * @author iDay
 * 
 */
public interface UserOperations {

	User getLoggedInUser();
	UserInfo getInfo(long uid);

}
