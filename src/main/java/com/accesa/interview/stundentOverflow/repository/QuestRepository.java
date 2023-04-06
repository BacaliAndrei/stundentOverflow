package com.accesa.interview.stundentOverflow.repository;

import com.accesa.interview.stundentOverflow.entity.QuestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends CrudRepository<QuestEntity,Integer>, PagingAndSortingRepository<QuestEntity,Integer> {
}
