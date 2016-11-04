package com.dub.bp.repositories;

import com.dub.bp.domain.BusinessProcessTemplate;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Igor_Strakhov
 */
public interface BusinessProcessTemplateRepository extends MongoRepository<BusinessProcessTemplate, String> {

}
