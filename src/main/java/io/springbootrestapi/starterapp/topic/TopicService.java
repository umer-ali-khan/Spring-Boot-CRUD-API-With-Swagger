package io.springbootrestapi.starterapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private static List<Topic> topics;
	
	static {
		
		topics = new ArrayList<Topic>(Arrays.asList(
				new Topic(),
				new Topic("1", "CS", "Computer Science"),
				new Topic("2", "Electrical Engineering", "Electrical Engineering")));
	}
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic = new Topic();
		if (!id.isEmpty() && null != id) {
			Optional<Topic> topicFound = topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findAny();
			if(topicFound.isPresent()) {
				topic = topicFound.get();
			}
		}
		return topic;	
	}
	
	public void addTopic(Topic t) {
		topics.add(t);
	}
	
	public void updateTopic(String id, Topic t) {
		for(Topic topic: topics) {
			if(topic.getId().equals(id)) {
				topic.setDescription(t.getDescription());
				topic.setName(t.getName());
				break;
			}
		}
	}

	public void deleteTopic(String id, Topic t) {
		
		for(Topic topic: topics) {
			if(topic.getId().equals(id)) {
				topics.remove(topic);
				break;
			}
		}
	}

	public void patchTopic(String id, PatchTopic t) {
		
		for(Topic topic: topics) {
			if(topic.getId().equals(id)) {
				topic.setDescription(t.getDescription());
				break;
			}
		}
	}
}
