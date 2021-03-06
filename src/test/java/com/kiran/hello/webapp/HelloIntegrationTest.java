package com.kiran.hello.webapp;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

public class HelloIntegrationTest {
	private static String HELLO_URL = "http://localhost:8082/test_job/hello";

	@Test
	public void testHello() throws Exception {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(HELLO_URL);
		String response = webTarget.request().get(String.class);
		assertThat(response, is("Hello, World!"));
	}
}
