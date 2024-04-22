package com.example.employment.domain.apply.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyResponseDto {
    private String id;
    private int index;
    private String name;
    private int age;
    private String date;
}
