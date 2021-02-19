package com.spy.databrowser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Service
//public interface RestTemplateService {
//public <T> T getCompanyInfo(String url, Class<T> type, Map<String, ?> params);
public class RestTemplateService {
    @Autowired
    private RestTemplate restTemplate;

    public <T> T getCompanyInfo(String url, Class<T> type, Map<String, ?> params) {
        return restTemplate.getForObject(url, type, params);
    }
}
