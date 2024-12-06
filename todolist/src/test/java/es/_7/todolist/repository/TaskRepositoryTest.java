package es._7.todolist.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import es._7.todolist.models.Task;
import es._7.todolist.repositories.TaskRepository;
import jakarta.persistence.EntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@DataJpaTest
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    @Disabled
    void saveTask() {
        Task task = new Task();
        task.setTitle("Task 1");
        task.setDescription("Description 1");

        Task savedTask = taskRepository.save(task);

        assertThat(savedTask.getId()).isNotNull();
        assertThat(savedTask.getTitle()).isEqualTo(task.getTitle());
        assertThat(savedTask.getDescription()).isEqualTo(task.getDescription());
    }
}
