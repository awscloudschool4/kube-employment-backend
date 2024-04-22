package com.example.employment.service;

import com.example.employment.domain.job.Job;
import com.example.employment.domain.job.dto.JobRequestDto;
import com.example.employment.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class JobService {
    private final JobRepository jobRepository;
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    public String saveJob(JobRequestDto.JobReqInfo jobReqInfo) {
        int count= (int) jobRepository.count();
        Job job=new Job(jobReqInfo, count);
        Job save=jobRepository.save(job);
        return save.getIndex()+" 번째 취업 공고 저장 완료";
    }
}
