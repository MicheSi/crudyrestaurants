package com.lambdaschool.crudyrestaurants.repositories;

import com.lambdaschool.crudyrestaurants.models.JobTitle;
import org.springframework.data.repository.CrudRepository;

public interface JobTitleRepository extends CrudRepository<JobTitle, Long> {
}
