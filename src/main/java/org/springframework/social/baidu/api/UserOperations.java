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
	UserDetails getInfo(long uid);

}
