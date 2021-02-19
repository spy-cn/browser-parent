package com.spy.databrowser.resp;

import com.spy.databrowser.entity.Company;
import lombok.Data;

import java.util.List;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Data
public class CompaniesResp {
    private List<Company> result;
}
