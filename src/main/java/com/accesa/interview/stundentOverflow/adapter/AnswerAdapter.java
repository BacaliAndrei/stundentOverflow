package com.accesa.interview.stundentOverflow.adapter;

import com.accesa.interview.stundentOverflow.dto.AnswerCreateDto;
import com.accesa.interview.stundentOverflow.entity.AnswerEntity;

public class AnswerAdapter {

    public  static AnswerEntity convertToAnswerEntity(AnswerCreateDto answerCreateDto){

        AnswerEntity answer=new AnswerEntity();
        answer.setAnswerDescription(answerCreateDto.getAnswerDescription());

        return answer;
    }
}
