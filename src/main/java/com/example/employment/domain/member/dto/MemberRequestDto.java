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
        private String type;
        private String birthday;
        private String gpa;
        private String school;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LoginReqInfo {
        private String email;
        private String password;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EmailRefInfo {
        private String email;
    }
}
