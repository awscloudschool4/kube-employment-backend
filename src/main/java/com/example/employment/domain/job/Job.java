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
    private String name;
    private int age;
    private int index;
    private String date;
    public Job(JobRequestDto.JobReqInfo jobReqInfo, int count) {
        this.index=count+1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date= LocalDateTime.now().format(formatter);
        this.name=jobReqInfo.getName();
        this.age=jobReqInfo.getAge();
    }
}
