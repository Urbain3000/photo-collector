package com.urbain.photocollector.repositotries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.urbain.photocollector.entities.AdresseEntity;

@Repository
public interface AdresseRepository extends CrudRepository<AdresseEntity, Long> {

}
