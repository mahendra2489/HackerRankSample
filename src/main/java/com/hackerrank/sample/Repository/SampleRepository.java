package com.hackerrank.sample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.sample.dto.SampleEntity;





@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Integer> {

	List<SampleEntity> findAllByOrderByIdAsc();
	List<SampleEntity> findAllByFirstName(String fristName);
}
