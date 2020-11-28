package com.cosmos.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cosmos.model.Answer;

@Repository
public interface AnswerRepository extends MongoRepository<Answer, Long>{

	List getAnswerByQuestionseq(Long questionseq);
}
