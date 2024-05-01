package com.example.employment.service;

import com.example.employment.domain.member.Member;
import com.example.employment.domain.member.dto.MemberRequestDto;
import com.example.employment.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public String deleteMember(int index) {
        Member member = memberRepository.findByIndex(index);
        memberRepository.delete(member);
        return member.getName() + " 회원 정보 삭제";
    }

    public Member findByIndex(int index) {
        return memberRepository.findByIndex(index);
    }

    public String login(MemberRequestDto.LoginReqInfo loginReqInfo) {
        String email=loginReqInfo.getEmail();
        String password=loginReqInfo.getPassword();
        List<Member> members=memberRepository.findAll();
        Boolean isCorrect = false;
        for (int i=0;i<members.size();i++) {
            if (Objects.equals(members.get(i).getEmail(), email) && Objects.equals(members.get(i).getPassword(), password)) {
                isCorrect = true;
                break;
            }
        }
        if (isCorrect) {
            return "로그인 성공!";
        }
        else {
            return "아이디 비밀번호를 다시 확인해주세요.";
        }
    }

    public List<Member> findByEmail(MemberRequestDto.EmailRefInfo emailRefInfo) {
        String email=emailRefInfo.getEmail();
        List<Member> members=memberRepository.findAll();
        List<Member> result=new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {
            if (Objects.equals(members.get(i).getEmail(), email)) {
                result.add(members.get(i));
            }
        }
        return result;
    }
}
