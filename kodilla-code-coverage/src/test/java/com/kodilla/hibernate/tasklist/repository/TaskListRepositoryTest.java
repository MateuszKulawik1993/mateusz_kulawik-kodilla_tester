package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test List", "This is a test description.");
        taskListRepository.save(taskList);

        // When
        List<TaskList> retrievedTaskLists = taskListRepository.findByListName("Test List");

        // Then
        assertEquals(1, retrievedTaskLists.size());
        assertEquals("Test List", retrievedTaskLists.get(0).getListName());
        assertEquals("This is a test description.", retrievedTaskLists.get(0).getDescription());

        // Clean-up
        taskListRepository.delete(taskList);
    }
}