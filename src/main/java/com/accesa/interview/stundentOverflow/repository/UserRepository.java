package com.accesa.interview.stundentOverflow.repository;

import com.accesa.interview.stundentOverflow.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>, PagingAndSortingRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUserName(String username);
}
