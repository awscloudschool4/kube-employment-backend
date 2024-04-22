package com.example.employment.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberRequestDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberReqInfo {
        public String name;
        public int age;
    }
}
