package com.example.swit.repos;

import com.example.swit.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo  extends CrudRepository<Message, Long> {
}
