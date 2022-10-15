package com.yash.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yash.springbootproject.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {
}
