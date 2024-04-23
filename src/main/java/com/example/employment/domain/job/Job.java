package com.example.employment.domain.job;

import com.example.employment.domain.job.dto.JobRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "job")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Job {
    @Id
    private String id;
    private int index;
    private String title;
    private String name;
    private String writeDate;
    private String updateDate;
    private String text;
    private Object questions;
    public Job(JobRequestDto.JobReqInfo jobReqInfo, int count) {
        this.index=count+1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.title=jobReqInfo.getTitle();
        this.name=jobReqInfo.getName();
        this.writeDate = LocalDateTime.now().format(formatter);
        this.updateDate = LocalDateTime.now().format(formatter);
        this.text=jobReqInfo.getText();
        this.questions = jobReqInfo.getQuestions();
    }
}
