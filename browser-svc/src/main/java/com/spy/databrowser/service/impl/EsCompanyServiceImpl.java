package com.spy.databrowser.service.impl;

import com.spy.databrowser.resp.EsCompaniesResp;
import com.spy.databrowser.service.EsCompanyService;
import com.spy.databrowser.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Service
public class EsCompanyServiceImpl implements EsCompanyService {
    @Resource
    private RestTemplateService restTemplateService;
    @Value("${api_elastic_search_company_info}")
    private String api_elastic_search_company_info;
    @Override
    public EsCompaniesResp getCompanyInfo(String keyword, Integer page, Integer size) {
        Map<String, Object> map = new HashMap<>();
        map.put("keyword",keyword);
        map.put("page",page);
        map.put("size",size);
        EsCompaniesResp esCompanyInfo = restTemplateService.getCompanyInfo(api_elastic_search_company_info, EsCompaniesResp.class, map);
        return esCompanyInfo;
    }
}
