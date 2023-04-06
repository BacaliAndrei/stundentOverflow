package com.accesa.interview.stundentOverflow.service;

import com.accesa.interview.stundentOverflow.dto.AnswerCreateDto;
import com.accesa.interview.stundentOverflow.entity.AnswerEntity;

public interface AnswerService {
    AnswerEntity createAnswer(AnswerCreateDto answerCreateDto);
}
