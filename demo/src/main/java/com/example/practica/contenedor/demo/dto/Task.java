package com.example.practica.contenedor.demo.dto;

public class Task{
    
    private int taskID;
    private String taskName;
    private String taskDueDate;
    private String taskStatus;

    public Task(int taskID, String taskName, String taskDueDate, String taskStatus) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDueDate = taskDueDate;
        this.taskStatus = taskStatus;
    }

    //getters
    public int taskID() {
        return taskID;
    }
    public String taskName() {
        return taskName;
    }
    public String taskDueDate() {
        return taskDueDate;
    }
    public String taskStatus() {
        return taskStatus;
    }
    //setters
    public void taskID(int taskID) {
        this.taskID = taskID;
    }
    public void taskName(String taskName) {
        this.taskName = taskName;
    }
    public void taskDueDate(String taskDueDate) {
        this.taskDueDate = taskDueDate;
    }
    public void taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
}
