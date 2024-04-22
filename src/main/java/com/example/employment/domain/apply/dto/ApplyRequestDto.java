package com.example.employment.domain.apply.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ApplyRequestDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ApplyReqInfo {
        public String name;
        public int age;
    }
}
