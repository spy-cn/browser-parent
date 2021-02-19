package com.spy.databrowser.service;

import com.spy.databrowser.resp.CompaniesResp;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
public interface CompanyService {
    /**
     * 关键字 查询公司信息
     *
     * @param keyword
     * @param page
     * @param size
     * @return
     */
    CompaniesResp getCompanyInfo(String keyword, Integer page, Integer size);
}
