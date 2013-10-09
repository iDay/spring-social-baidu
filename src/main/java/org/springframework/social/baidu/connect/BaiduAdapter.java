/**
 * 
 */
package org.springframework.social.baidu.connect;

import org.springframework.social.baidu.api.Baidu;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * @author iDay
 *
 */
public class BaiduAdapter implements ApiAdapter<Baidu> {

	public boolean test(Baidu api) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setConnectionValues(Baidu api, ConnectionValues values) {
		// TODO Auto-generated method stub
		
	}

	public UserProfile fetchUserProfile(Baidu api) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStatus(Baidu api, String message) {
		// TODO Auto-generated method stub
		
	}

}
