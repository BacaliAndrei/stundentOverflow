package com.accesa.interview.stundentOverflow.adapter;

import com.accesa.interview.stundentOverflow.dto.QuestCreateDto;
import com.accesa.interview.stundentOverflow.entity.QuestEntity;

public class QuestAdapter {

    public static QuestEntity convertToQuestEntity(QuestCreateDto questCreateDto) {

        QuestEntity quest = new QuestEntity();
        quest.setQuestValue(questCreateDto.getQuestValue());
        quest.setQuestDescription(questCreateDto.getDescription());

        return quest;
    }

}
