package com.example.todo.service;

import com.example.todo.model.Todo;
import com.example.todo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService implements ITodoService {
    @Autowired
    private ITodoRepository todoRepository;

    private static final List<Todo> todos = new ArrayList<>();
    @Override
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }
    @Override
    public Todo findById(int id) {
        return todoRepository.findById(id).get();
    }
    @Override

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }
    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
    @Override
    public void updateTodo(int id,Todo newTodo) {

        Todo todo = todoRepository.findById(id).get();
        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());

        todoRepository.save(todo);
    }
}
