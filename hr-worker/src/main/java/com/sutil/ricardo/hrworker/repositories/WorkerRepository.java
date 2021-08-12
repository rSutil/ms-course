package com.sutil.ricardo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutil.ricardo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
