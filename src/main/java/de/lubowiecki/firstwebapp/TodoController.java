package de.lubowiecki.firstwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired // IoC, DependencyInjection
    TodoRepository repo;

    @GetMapping("/")
    public String hallo() {
        return "Hallo Spring";
    }

    @GetMapping("/namen")
    public List<String> getNames() {
        return List.of("Peter", "Bruce", "Carol", "Tony");
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        /*
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Essen mit Peter"));
        todos.add(new Todo("Kochen"));
        todos.add(new Todo("Abwaschen"));
        */
        return repo.findAll();
    }

    @GetMapping("/new")
    public String create() {
        Todo todo = new Todo("Irgendwas...");
        repo.save(todo);
        return "Gespeichert";
    }
}
