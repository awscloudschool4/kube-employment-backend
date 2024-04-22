package com.example.employment.repository;

import com.example.employment.domain.member.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories
public interface MemberRepository extends MongoRepository<Member, String> {
    List<Member> findAll();
}
