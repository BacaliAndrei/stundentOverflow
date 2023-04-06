package com.accesa.interview.stundentOverflow.repository;

import com.accesa.interview.stundentOverflow.entity.AnswerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<AnswerEntity, Integer>, PagingAndSortingRepository<AnswerEntity, Integer> {
}
