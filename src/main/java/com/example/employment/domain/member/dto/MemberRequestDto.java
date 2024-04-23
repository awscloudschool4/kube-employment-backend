package com.example.employment.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberRequestDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberReqInfo {
        private String email;
        private String password;
        private String name;
        private String birthday;
        private String gpa;
        private String school;
    }
}
