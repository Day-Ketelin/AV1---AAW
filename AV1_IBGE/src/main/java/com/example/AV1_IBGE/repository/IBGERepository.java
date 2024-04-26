package com.example.AV1_IBGE.repository;

import com.example.AV1_IBGE.model.IBGEEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface IBGERepository extends MongoRepository<IBGEEntity, String> {
}
