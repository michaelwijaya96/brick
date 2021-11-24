package com.brick.proxy;

import com.brick.dto.QueryTokopediaProductRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * @author Michael Wijaya
 * @version $Id: TokopediaProxy.java, v0.1 Nov 23, 2021 4:54 PM Michael Wijaya Exp $
 */
@FeignClient(name = "tokopedia", url = "https://gql.tokopedia.com")
public interface TokopediaProxy {

    @PostMapping
    List<Map<String, Object>> queryProduct(@RequestBody List<QueryTokopediaProductRequestDTO> queryTokopediaProductRequestDTO);
}

