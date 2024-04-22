package com.example.employment.domain.apply;

import com.example.employment.domain.apply.dto.ApplyRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "apply")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Apply {
    @Id
    private String id;
    private int index;
    private String name;
    private int age;
    private String date;
    public Apply(ApplyRequestDto.ApplyReqInfo applyReqInfo, int count) {
        this.index=count+1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date= LocalDateTime.now().format(formatter);
        this.name=applyReqInfo.getName();
        this.age=applyReqInfo.getAge();
    }
}
