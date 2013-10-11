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
public class UserTestCase {
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
	public void testUser() {
		try {
			User user = (User) converter.read(User.class, new HttpInputMessage() {

				public HttpHeaders getHeaders() {
					return null;
				}

				public InputStream getBody() throws IOException {
					return new ByteArrayInputStream(("{\"uid\":2346677,"
							+ "\"uname\":\"liupc24\","
							+ "\"portrait\":\"e2c1776c31393837313031319605\""
							+ "}").getBytes());
				}
			});
			assertEquals(user.getUid(), 2346677);
			assertEquals(user.getUname(), "liupc24");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
