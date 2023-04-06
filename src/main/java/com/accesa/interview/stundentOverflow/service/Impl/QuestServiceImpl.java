package com.accesa.interview.stundentOverflow.service.Impl;

import com.accesa.interview.stundentOverflow.adapter.QuestAdapter;
import com.accesa.interview.stundentOverflow.dto.QuestCreateDto;
import com.accesa.interview.stundentOverflow.entity.QuestEntity;
import com.accesa.interview.stundentOverflow.repository.QuestRepository;
import com.accesa.interview.stundentOverflow.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("questService")
public class QuestServiceImpl implements QuestService {

    private final QuestRepository questRepository;

    @Autowired
    public QuestServiceImpl(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    @Override
    public QuestEntity createQuest(QuestCreateDto questCreateDto) {

        QuestEntity questEntity = QuestAdapter.convertToQuestEntity(questCreateDto);
        QuestEntity quest = questRepository.save(questEntity);

        return quest;
    }
}
