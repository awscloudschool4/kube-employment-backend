package com.example.employment.repository;

import com.example.employment.domain.apply.Apply;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories
public interface ApplyRepository extends MongoRepository<Apply, String> {
    List<Apply> findAll();

    Apply findByIndex(int index);
}
