package com.example.employment.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private String id;
    private int index;
    private String email;
    private String password;
    private String name;
    private String type;
    private String birthday;
    private String gpa;
    private String school;
    private String date;
}
