package com.dub.bp.repositories;

import com.dub.bp.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Igor_Strakhov
 */
public interface UserRepository extends MongoRepository<User, String> {

}
