package com.example.employment.service;

import com.example.employment.domain.apply.Apply;
import com.example.employment.domain.apply.dto.ApplyRequestDto;
import com.example.employment.repository.ApplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ApplyService {
    private final ApplyRepository applyRepositoy;

    public List<Apply> findAll() {
        return applyRepositoy.findAll();
    }

    public String saveApply(ApplyRequestDto.ApplyReqInfo applyReqInfo) {
        int count= (int) applyRepositoy.count();
        Apply apply=new Apply(applyReqInfo,count);
        Apply save=applyRepositoy.save(apply);
        return save.getIndex()+" 번째 지원서 정보 저장 완료";
    }
}
