package com.spy.databrowser.controller;

import com.spy.databrowser.mapper.TestMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestMapper testMapper;
    @GetMapping("/")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(testMapper.getAll());
    }
}
