package com.example.todo_api.repository.sample.repository.task;

import com.example.todo_api.repository.task.TaskRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskRepository {

    @Select("SELECT id, title FROM tasks WHERE id = #{taskId}")
    Optional<TaskRecord> select(long taskId);

    @Select("SELECT id, title FROM tasks LIMIT #{limit} OFFSET #{offset}")
    List<TaskRecord> selectList(int limit, long offset);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO tasks (title) VALUES (#{title})")
    void insert(TaskRecord record);

    @Update("UPDATE tasks SET title = #{title} WHERE id = #{id}")
    void update(TaskRecord taskRecord);

    @Delete("DELETE FROM tasks WHERE id = #{id}")
    void delete(Long taskId);
}
