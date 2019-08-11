package io.tapan.springquickstart.springdemo.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepositary extends CrudRepository<Topic, String> {

}
