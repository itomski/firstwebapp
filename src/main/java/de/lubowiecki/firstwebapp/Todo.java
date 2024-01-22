package de.lubowiecki.firstwebapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private LocalDateTime createdAt;

    private String title;

    private String description = "";

    private boolean done;

    public Todo() {
    }

    public Todo(String title) {
        createdAt = LocalDateTime.now();
        this.title = title;
    }

    public Todo(String title, String description) {
        this(title);
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
