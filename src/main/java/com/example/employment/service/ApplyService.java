package com.example.employment.service;

import com.example.employment.domain.apply.Apply;
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
        return null;
    }
}
