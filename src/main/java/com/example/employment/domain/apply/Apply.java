package com.example.employment.domain.apply;

import com.example.employment.domain.apply.dto.ApplyRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Document(collection = "apply")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Apply {
    @Id
    private String id;
    private int index;
    private String name;
    private String writeDate;
    private Object answer;
    private String isPass;
    public Apply(ApplyRequestDto.ApplyReqInfo applyReqInfo, int count) {
        this.index=count+1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.name=applyReqInfo.getName();
        this.writeDate = LocalDateTime.now().format(formatter);
        this.answer=applyReqInfo.getAnswer();
        this.isPass= applyReqInfo.getIsPass();
    }
}
