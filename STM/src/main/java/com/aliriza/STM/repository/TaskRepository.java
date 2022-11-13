package com.aliriza.STM.repository;

import com.aliriza.STM.model.Status;
import com.aliriza.STM.model.Task;
import com.aliriza.STM.model.Type;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface TaskRepository {
    List<Task> users = new ArrayList<>(
     Arrays.asList(
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
        )
    );
}
