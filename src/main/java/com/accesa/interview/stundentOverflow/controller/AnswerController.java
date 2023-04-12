package com.accesa.interview.stundentOverflow.controller;

import com.accesa.interview.stundentOverflow.dto.AnswerCreateDto;
import com.accesa.interview.stundentOverflow.entity.AnswerEntity;
import com.accesa.interview.stundentOverflow.service.AnswerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/answer")
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/create")
    public ResponseEntity<AnswerEntity> createAnswer(@RequestBody @Valid AnswerCreateDto answerCreateDto) {

        AnswerEntity answer = answerService.createAnswer(answerCreateDto);

        return ResponseEntity.ok(answer);
    }
    @GetMapping("/")
    public ResponseEntity<AnswerCreateDto> getAnswer(@RequestParam("id") Integer id){
        AnswerCreateDto answer=answerService.answerCreateDTO(id);
        return ResponseEntity.ok(answer);
    }
}
