package com.cosmos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmos.model.Answer;
import com.cosmos.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private IdSequenceService idSequenceService;

	public Answer saveAnswer(Answer answer) {
		// TODO Auto-generated method stub
		Long id = idSequenceService.getNext();
		answer.setAnswerseq(id);
		answer.setActive(true);
		answer.setNow(LocalDate.now());
		return answerRepository.save(answer);
	}

	public List<Answer> getAllAnswerForQuestion(Long questionseq) {
		// TODO Auto-generated method stub
		return answerRepository.getAnswerByQuestionseq(questionseq);
	}

}
