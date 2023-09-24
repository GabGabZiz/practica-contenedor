package com.example.practica.contenedor.demo.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica.contenedor.demo.bl.TaskBL;
import com.example.practica.contenedor.demo.dto.Task;


@RestController
public class TaskAPI {

    private TaskBL taskBl;
    
    public TaskAPI(){
        taskBl = new TaskBL();
    }

    @GetMapping("/")
    public Map create(Task task){
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code","Task-0000");
        result.put("result", "Task created successfully");
        result.put("errorMessage", "");
        return result;

    }

    /* public Map listAll(){
        return taskBl.listAll();
    }
    public Map delete(int taskID){
        taskBl.delete(taskID);
    } */
    
}
