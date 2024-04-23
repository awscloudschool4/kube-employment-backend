package com.example.employment.domain.job.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JobResponseDto {
    private String id;
    private int index;
    private String title;
    private String name;
    private String writeDate;
    private String updateDate;
    private String text;
    private Object questions;
}
