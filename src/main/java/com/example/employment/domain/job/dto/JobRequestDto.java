package com.example.employment.domain.job.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class JobRequestDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JobReqInfo {
        public String name;
        public int age;
    }
}
