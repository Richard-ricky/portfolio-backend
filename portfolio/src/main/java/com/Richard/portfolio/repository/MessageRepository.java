package com.Richard.portfolio.repository;

import com.Richard.portfolio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
