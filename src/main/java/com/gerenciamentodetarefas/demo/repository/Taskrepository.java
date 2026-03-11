package com.gerenciamentodetarefas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciamentodetarefas.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}