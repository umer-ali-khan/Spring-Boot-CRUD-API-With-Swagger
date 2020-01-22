package io.springbootrestapi.starterapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.springbootrestapi.starterapp.topic.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
