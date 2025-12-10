package com.slavapleshkov.productivityhub.domain.task;

import com.slavapleshkov.productivityhub.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByOwner(User owner);

    List<Task> findByOwnerAndStatus(User owner, TaskStatus status);

    List<Task> findByOwnerAndDueDate(User owner, LocalDate dueDate);


}
