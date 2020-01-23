package io.springbootrestapi.starterapp.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic t) {
		topicService.addTopic(t);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic t, @PathVariable String id) {
		topicService.updateTopic(id, t);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@RequestBody Topic t, @PathVariable String id) {
		topicService.deleteTopic(id, t);
	}
	
	@PatchMapping("/topics/{id}")
	public void patchTopic(@RequestBody PatchTopic t, @PathVariable String id) {
		topicService.patchTopic(id, t);
	}
}
