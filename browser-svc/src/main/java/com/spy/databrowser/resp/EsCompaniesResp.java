package com.spy.databrowser.resp;

import lombok.Data;

import java.util.List;

@Data
public class EsCompaniesResp {

    private List<EsCompanyResp> result;
}
