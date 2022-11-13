package com.aliriza.STM.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Task {


    private static int GlobalId;

    private int TaskId;

    private String title;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime stopDate;

    private Type type;

    private Status status;

    public Task(String title, String description, LocalDateTime stopDate, Type type, Status status){
        this.TaskId = ++GlobalId;
        this.title = title;
        this.description = description;
        this.stopDate = stopDate;
        this.type = type;
        this.status = status;
        this.startDate = LocalDateTime.now();
    }

}
