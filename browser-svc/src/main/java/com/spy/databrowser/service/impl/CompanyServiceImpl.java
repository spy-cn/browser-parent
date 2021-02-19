package com.spy.databrowser.service.impl;

import com.spy.databrowser.entity.Company;

import com.spy.databrowser.resp.CompaniesResp;

import com.spy.databrowser.resp.EsCompaniesResp;
import com.spy.databrowser.resp.EsCompanyResp;
import com.spy.databrowser.service.CompanyService;
import com.spy.databrowser.service.EsCompanyService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private EsCompanyService esCompanyService;

    @Override
    public CompaniesResp getCompanyInfo(String keyword, Integer page, Integer size) {
        CompaniesResp resp = new CompaniesResp();
        if (StringUtils.isBlank(keyword)) {
            return resp;
        }
        EsCompaniesResp esCompaniesResp = esCompanyService.getCompanyInfo(keyword, page, size);
        if (ObjectUtils.isEmpty(esCompaniesResp)) {
            return resp;
        }
        List<EsCompanyResp> esCompanyResp = esCompaniesResp.getResult();
        resp = generatorCompaniesResp(esCompanyResp);
        return resp;
    }

    private CompaniesResp generatorCompaniesResp(List<EsCompanyResp> esCompanyResp) {
        CompaniesResp resp = new CompaniesResp();
        List<Company> companyList = esCompanyResp.stream().map(es -> {
            Company company = new Company(
                    es.getCsfId(),
                    es.getName(),
                    ObjectUtils.isNotEmpty(es.getSecurities()) ? es.getSecurities().get(0).getSecu() : null,
                    ObjectUtils.isNotEmpty(es.getSecurities()) ? es.getSecurities().get(0).getTick() : null,
                    null
            );
            return company;
        }).collect(Collectors.toList());
        resp.setResult(companyList);
        return resp;
    }
}
