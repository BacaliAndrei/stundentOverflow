package com.accesa.interview.stundentOverflow.controller;

import com.accesa.interview.stundentOverflow.dto.QuestCreateDto;
import com.accesa.interview.stundentOverflow.entity.QuestEntity;
import com.accesa.interview.stundentOverflow.service.QuestService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/quest")
public class QuestController {

    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @PostMapping("/create")
    public ResponseEntity<QuestEntity> createQuest(@RequestBody @Valid QuestCreateDto questCreateDto) {

        QuestEntity quest = questService.createQuest(questCreateDto);

        return ResponseEntity.ok(quest);

    }
}
