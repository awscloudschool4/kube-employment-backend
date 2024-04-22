package com.example.employment.service;

import com.example.employment.domain.member.Member;
import com.example.employment.domain.member.dto.MemberRequestDto;
import com.example.employment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public String saveMember(MemberRequestDto.MemberReqInfo memberReqInfo) {
        int count= (int) memberRepository.count();
        Member member=new Member(memberReqInfo,count);
        Member save = memberRepository.save(member);
        return save.getIndex()+" 번째 회원 정보 저장 완료";
    }
}
