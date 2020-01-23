package io.springbootrestapi.starterapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import io.springbootrestapi.starterapp.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic t = null;
		Optional<Topic> topic = topicRepository.findById(id);
		if(topic.isPresent()) {
			t = topic.get();
		}
		return t;
	}
	
	public void addTopic(Topic t) {
		topicRepository.save(t);
	}
	
	public void updateTopic(String id, Topic t) {
		if(topicRepository.existsById(id)) {
			topicRepository.save(t);
		}
	}

	public void deleteTopic(String id, Topic t) {
		topicRepository.deleteById(id);
	}

	public void patchTopic(String id, PatchTopic t) {
//
//		for(Topic topic: topics) {
//			if(topic.getId().equals(id)) {
//				topic.setDescription(t.getDescription());
//				break;
//			}
//		}
	}
}
