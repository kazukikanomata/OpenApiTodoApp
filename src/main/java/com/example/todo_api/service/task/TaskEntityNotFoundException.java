package com.example.todo_api.service.task;

public class TaskEntityNotFoundException extends RuntimeException{

    private long taskId; // 取得に失敗したタスクのiDをとるもの

    public TaskEntityNotFoundException(long taskId){
        super("TaskEntity (id = )" + taskId + ") is not found."); // RuntimeExceptionのコンストラクタを呼び出している
        this.taskId = taskId;
    }
}
