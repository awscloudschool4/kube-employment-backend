package com.example.employment.controller;

import com.example.employment.domain.apply.Apply;
import com.example.employment.domain.apply.dto.ApplyRequestDto;
import com.example.employment.service.ApplyService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ApplyController {
    private final ApplyService applyService;

    private static final Logger logger = LoggerFactory.getLogger(ApplyController.class);

    @GetMapping("/apply")
    public ResponseEntity<List<Apply>> getAllApply() {
        logger.info("Responding with body: {}", "모든 지원서 출력");
        return ResponseEntity.ok(applyService.findAll());
    }

    @PostMapping("/apply")
    public ResponseEntity<String> saveApply(@RequestPart(value = "ApplyReqInfo")ApplyRequestDto.ApplyReqInfo applyReqInfo) {
        logger.info("Responding with body: {}", "지원서 정보 저장");
        return ResponseEntity.ok(applyService.saveApply(applyReqInfo));
    }
}
