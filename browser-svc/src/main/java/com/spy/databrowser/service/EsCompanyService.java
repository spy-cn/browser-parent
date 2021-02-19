package com.spy.databrowser.service;

import com.spy.databrowser.resp.EsCompaniesResp;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
public interface EsCompanyService {
    /**
     * 在es中搜索公司信息
     * @param keyword
     * @param page
     * @param size
     * @return
     */
    EsCompaniesResp getCompanyInfo(String keyword, Integer page, Integer size);
}
