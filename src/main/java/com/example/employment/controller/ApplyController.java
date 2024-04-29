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

    @PutMapping("/apply")
    public ResponseEntity<String> updatePass(@RequestPart(value="ApplyPassInfo")ApplyRequestDto.ApplyPassInfo applyPassInfo) {
        logger.info("Responding with body: {}", "합격 여부 수정");
        return ResponseEntity.ok(applyService.updatePass(applyPassInfo));
    }

    @DeleteMapping("/apply/{index}")
    public ResponseEntity<String> deleteApply(@PathVariable("index") int index) {
        logger.info("Responding with body: {}", "지원서 삭제");
        return ResponseEntity.ok(applyService.deleteApply(index));
    }

    @GetMapping("/apply/{index}")
    public ResponseEntity<Apply> getApplyByIndex(@PathVariable("index") int index) {
        logger.info("Responding with body: {}", "해당 지원서 출력");
        return ResponseEntity.ok(applyService.findByIndex(index));
    }

    @GetMapping("/apply/job")
    public ResponseEntity<List<Apply>> getApplyByJobName(@RequestPart(value="ApplyNameInfo")ApplyRequestDto.ApplyNameInfo applyNameInfo) {
        logger.info("Responding with body: {}", "해당 지원서 출력");
        return ResponseEntity.ok(applyService.findByJobName(applyNameInfo));
    }

    @GetMapping("/apply/name")
    public ResponseEntity<List<Apply>> getApplyByName(@RequestPart(value="ApplyNameInfo")ApplyRequestDto.ApplyNameInfo applyNameInfo) {
        logger.info("Responding with body: {}", "해당 지원서 출력");
        return ResponseEntity.ok(applyService.findByName(applyNameInfo));
    }
}
