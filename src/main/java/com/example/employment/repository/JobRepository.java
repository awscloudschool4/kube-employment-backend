package com.example.employment.repository;

import com.example.employment.domain.job.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories
public interface JobRepository extends MongoRepository<Job, String> {
    List<Job> findAll();
}
