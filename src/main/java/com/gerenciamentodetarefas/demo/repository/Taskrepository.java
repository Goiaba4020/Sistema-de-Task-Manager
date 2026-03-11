package com.gerenciamentodetarefas.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.Repository.JpaRepository;

import com.gerenciamentodetarefas.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAll();

    public Task save(Task task);

    public Object findById(Long id);
}