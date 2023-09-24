package com.example.practica.contenedor.demo.bl;

import java.util.*;

import com.example.practica.contenedor.demo.dto.Task;

public class TaskBL {

    List<Task> database = new ArrayList();

    public void create(Task task){
        database.add(task);
    }
    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskID){
        for(int i = 0; i < database.size(); i++){
            Task t = database.get(i);
            if(t.taskID()== taskID){
                database.remove(i);
            }
        }
    }
}

