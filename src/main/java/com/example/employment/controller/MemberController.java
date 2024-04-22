package com.example.employment.controller;

import com.example.employment.domain.member.Member;
import com.example.employment.domain.member.dto.MemberRequestDto;
import com.example.employment.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MemberController {
    private final MemberService memberService;
    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

    @GetMapping("/member")
    public ResponseEntity<List<Member>> getAllMember() {
        logger.info("Responding with body: {}", "모든 회원 정보 출력");
        return ResponseEntity.ok(memberService.findAll());
    }

    @PostMapping("/member")
    public ResponseEntity<String> saveMember(@RequestPart(value = "MemberReqInfo")MemberRequestDto.MemberReqInfo memberReqInfo) {
        logger.info("Responding with body: {}", "회원 정보 저장");
        return ResponseEntity.ok(memberService.saveMember(memberReqInfo));
    }
}
