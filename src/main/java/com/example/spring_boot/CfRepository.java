package com.example.spring_boot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CfRepository extends MongoRepository<User, String> {
    public User findByName(String name);
}