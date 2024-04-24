package com.example.employment.domain.apply.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class ApplyRequestDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ApplyReqInfo {
        private String name;
        private Object answer;
        private String isPass;
        private String jobName;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ApplyPassInfo {
        private String pass;
        private int index;
    }
}
