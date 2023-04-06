package com.accesa.interview.stundentOverflow.service.Impl;

import com.accesa.interview.stundentOverflow.adapter.AnswerAdapter;
import com.accesa.interview.stundentOverflow.dto.AnswerCreateDto;
import com.accesa.interview.stundentOverflow.entity.AnswerEntity;
import com.accesa.interview.stundentOverflow.repository.AnswerRepository;
import com.accesa.interview.stundentOverflow.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public AnswerEntity createAnswer(AnswerCreateDto answerCreateDto) {

        AnswerEntity answerEntity = AnswerAdapter.convertToAnswerEntity(answerCreateDto);
        AnswerEntity answer = answerRepository.save(answerEntity);

        return answer;
    }
}