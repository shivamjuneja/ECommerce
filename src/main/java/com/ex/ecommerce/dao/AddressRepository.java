package com.ex.ecommerce.dao;

import com.ex.ecommerce.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address,String> {
}
