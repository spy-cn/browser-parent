package com.spy.databrowser.controller;

import com.spy.databrowser.resp.CompaniesResp;
import com.spy.databrowser.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Resource
    private CompanyService companyService;
    @GetMapping("")
    public ResponseEntity searchCompany(String keyword,
                                        @RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "20") Integer size){
        CompaniesResp resp= companyService.getCompanyInfo(keyword, page, size);
        return ResponseEntity.ok(resp);
    }
}
