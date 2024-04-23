package com.example.employment.domain.member;

import com.example.employment.domain.member.dto.MemberRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "member")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {
    @Id
    private String id;
    private int index;
    private String email;
    private String password;
    private String name;
    private String birthday;
    private String gpa;
    private String school;
    private String date;
    public Member(MemberRequestDto.MemberReqInfo memberReqInfo, int count) {
        this.index=count+1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date= LocalDateTime.now().format(formatter);
        this.email=memberReqInfo.getEmail();
        this.password = memberReqInfo.getPassword();
        this.name=memberReqInfo.getName();
        this.birthday= memberReqInfo.getBirthday();
        this.gpa = memberReqInfo.getGpa();
        this.school= memberReqInfo.getSchool();
    }
}
