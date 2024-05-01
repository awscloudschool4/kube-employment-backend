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

    @DeleteMapping("/member/{index}")
    public ResponseEntity<String> deleteMember(@PathVariable("index") int index) {
        logger.info("Responding with body: {}", "회원 삭제");
        return ResponseEntity.ok(memberService.deleteMember(index));
    }

    @GetMapping("/member/{index}")
    public ResponseEntity<Member> findByIndex(@PathVariable("index") int index) {
        logger.info("Responding with body: {}", "인덱스로 회원 조회");
        return ResponseEntity.ok(memberService.findByIndex(index));
    }

    @PostMapping("/member/login")
    public ResponseEntity<String> login(@RequestPart(value = "LoginReqInfo")MemberRequestDto.LoginReqInfo loginReqInfo) {
        logger.info("Responding with body: {}", "로그인");
        return ResponseEntity.ok(memberService.login(loginReqInfo));
    }

    @GetMapping("/member/email")
    public ResponseEntity<List<Member>> findByEmail(@RequestPart(value="EmailReqInfo")MemberRequestDto.EmailRefInfo emailRefInfo) {
        logger.info("Responding with body: {}", "이메일로 회원 조회");
        return ResponseEntity.ok(memberService.findByEmail(emailRefInfo));
    }
}
