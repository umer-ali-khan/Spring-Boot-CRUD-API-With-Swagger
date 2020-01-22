package io.springbootrestapi.starterapp.topic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TopicControllerTests {
	
	@LocalServerPort
	private int port;
	
	TestRestTemplate testRestTemplate = new TestRestTemplate();
	HttpHeaders httpHeaders = new HttpHeaders();
	
	@Test
	public void testCreateTopic() {
		HttpEntity<List<Topic>> entity = new HttpEntity<List<Topic>>(null, httpHeaders);
		
		ResponseEntity<String> response = testRestTemplate.exchange(createURLWithPort("/topics"), HttpMethod.GET, entity, String.class);
		String actual = response.getBody();
		System.out.println("hello ....  " + actual);
		assertTrue(actual.contains("No description"), "was true:");
	}

	private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
