package com.example.employment.controller;

import com.example.employment.domain.job.Job;
import com.example.employment.domain.job.dto.JobRequestDto;
import com.example.employment.service.JobService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class JobController {
    private final JobService jobService;
    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

    @GetMapping("/job")
    public ResponseEntity<List<Job>> findAllJob() {
        logger.info("Responding with body: {}", "모든 취업 공고 출력");
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping("/job")
    public ResponseEntity<String> saveJob(@RequestPart(value = "JobReqInfo")JobRequestDto.JobReqInfo jobReqInfo) {
        logger.info("Responding with body: {}", "취업 공고 저장");
        return ResponseEntity.ok(jobService.saveJob(jobReqInfo));
    }
}
