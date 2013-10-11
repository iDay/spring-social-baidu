/**
 * 
 */
package org.springframework.social.baidu.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.social.baidu.api.json.BaiduModule;

import static org.junit.Assert.*;

/**
 * @author iDay
 * 
 */
public class UserInfoTestCase {
	MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		converter.getObjectMapper().registerModule(new BaiduModule());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserInfo() {
		try {
			UserInfo user = (UserInfo) converter.read(UserInfo.class,
					new HttpInputMessage() {

						public HttpHeaders getHeaders() {
							return null;
						}

						public InputStream getBody() throws IOException {
							return new ByteArrayInputStream(("{"
									+ "\"userid\":\"2097322476\","
									+ "\"username\":\"wl19871011\","
									+ "\"realname\":\"阳光\","
									+ "\"userdetail\":\"喜欢自由\","
									+ "\"birthday\":\"1987-01-01\","
									+ "\"marriage\":\"恋爱\"," + "\"sex\":\"男\","
									+ "\"blood\":\"O\","
									+ "\"constellation\":\"射手\","
									+ "\"figure\":\"小巧\","
									+ "\"education\":\"大学/专科\","
									+ "\"trade\":\"计算机/电子产品\","
									+ "\"job\":\"未知\","
									+ "\"birthday_year\":\"1987\","
									+ "\"birthday_month\":\"01\","
									+ "\"birthday_day\":\"01\"" + "}")
									.getBytes());
						}
					});
			assertEquals(user.getUserid(), 2097322476);
			assertEquals(user.getUsername(), "wl19871011");
			assertEquals(user.getTrade(), "计算机/电子产品");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
