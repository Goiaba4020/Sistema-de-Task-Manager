package com.gerenciamentodetarefas.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.gerenciamentodetarefas.demo.model.Task;
import com.gerenciamentodetarefas.demo.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }

    public Task updateTask(Long id, Task task) {
        Task existing = repository.findById(id).orElseThrow();
        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setCompleted(task.isCompleted());
        return repository.save(existing);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}