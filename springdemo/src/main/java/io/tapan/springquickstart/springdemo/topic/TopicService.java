package io.tapan.springquickstart.springdemo.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepositary topicRepositary;

	public List<Topic> getAllTopics() {
		List<Topic> list = new ArrayList<>();
		topicRepositary.findAll().forEach(
				topic -> {
					list.add(topic);
				});
		return list;
	}

	public Optional<Topic> getTopicById(String id) {
		return topicRepositary.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepositary.save(topic);	
	}

	public void updateTopic(String id,Topic topic) {
		topicRepositary.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepositary.deleteById(id);
	}

}
