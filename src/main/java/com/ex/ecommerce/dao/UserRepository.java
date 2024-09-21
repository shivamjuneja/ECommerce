package com.ex.ecommerce.dao;

import com.ex.ecommerce.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
}
