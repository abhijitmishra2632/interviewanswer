package com.cosmos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmos.model.Answer;
import com.cosmos.service.AnswerService;

@RestController
@RequestMapping("/answer")
public class AnswerController {
	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/{questionseq}")
	public List<Answer> getAllAnswerForQuestion(@PathVariable Long questionseq){
		return answerService.getAllAnswerForQuestion(questionseq);
	}
	@PostMapping
	public Answer saveAnswer(@RequestBody Answer answer) {
		return answerService.saveAnswer(answer);
	}

}
