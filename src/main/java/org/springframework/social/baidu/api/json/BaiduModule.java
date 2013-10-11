/**
 * 
 */
package org.springframework.social.baidu.api.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.baidu.api.User;
import org.springframework.social.baidu.api.UserInfo;

/**
 * @author iday
 * 
 */
public class BaiduModule extends SimpleModule {

	public BaiduModule() {
		super("BaiduModule", new Version(1, 0, 0, null));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.codehaus.jackson.map.module.SimpleModule#setupModule(org.codehaus
	 * .jackson.map.Module.SetupContext)
	 */
	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(User.class, UserMixin.class);
		context.setMixInAnnotations(UserInfo.class, UserInfoMixin.class);
	}

}
