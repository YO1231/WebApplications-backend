package com.example.demo.dto;

import com.example.demo.domain.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoDTO {
    private String id;
    private String title;
    private boolean done;

    public ToDoDTO(final TodoEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.done = entity.isDone();
    }

    public static TodoEntity toEntity(final ToDoDTO dto) {
        return TodoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .done(dto.isDone())
                .build();
    }
}
