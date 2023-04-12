package com.accesa.interview.stundentOverflow.service;

import com.accesa.interview.stundentOverflow.dto.QuestCreateDto;
import com.accesa.interview.stundentOverflow.entity.QuestEntity;

public interface QuestService {

    QuestEntity createQuest(QuestCreateDto questCreateDto);

    QuestCreateDto getQuestCreateDto(Integer id);
}
