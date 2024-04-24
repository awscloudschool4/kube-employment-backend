package com.example.employment.domain.apply.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyResponseDto {
    private String id;
    private int index;
    private String name;
    private String jobName;
    private String writeDate;
    private Object answer;
    private String isPass;
}
