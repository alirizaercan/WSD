package com.aliriza.STM.model;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = Arrays.asList(
                new Task(
                        "Learning Java",
                        "You should learn Java.",
                        LocalDateTime.of(2022,11,14,15,0),
                        Type.TASK,
                        Status.NEW
                ),
                new Task(
                        "Learning Python",
                        "If you learn Python, it will be very good.",
                        LocalDateTime.of(2022, 11, 7, 15, 0),
                        Type.BUG,
                        Status.IN_PROGRESS
                ),
                new Task(
                        "Codes",
                        "If you write your code so short and clear, you are very developer.",
                        LocalDateTime.of(2022, 10, 24, 15, 0),
                        Type.FEATURE,
                        Status.DONE
                )
        );

    public List<Task> getAllTasks(){
        return tasks;
    }
}
