package com.accesa.interview.stundentOverflow.repository;

import com.accesa.interview.stundentOverflow.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer>, PagingAndSortingRepository<CategoryEntity, Integer> {
}
