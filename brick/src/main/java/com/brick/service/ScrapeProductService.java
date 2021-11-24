package com.brick.service;

import com.brick.Util;
import com.brick.dto.QueryTokopediaProductRequestDTO;
import com.brick.dto.ScrapeProductResponse;
import com.brick.dto.TokopediaData;
import com.brick.dto.TokopediaShopCore;
import com.brick.proxy.TokopediaProxy;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Michael Wijaya
 * @version $Id: ScrapeProductService.java, v0.1 Nov 24, 2021 10:17 AM Michael Wijaya Exp $
 */
@Service
@Slf4j
public class ScrapeProductService {

    @Autowired
    private TokopediaProxy tokopediaProxy;

    public List<ScrapeProductResponse> queryProduct(){
        QueryTokopediaProductRequestDTO.Variable variables1 = new QueryTokopediaProductRequestDTO.Variable();
        variables1.setDevice("desktop");
        variables1.setIdentifier("clp_handphone-tablet_65");
        variables1.setComponentId("15");
        variables1.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO1 = new QueryTokopediaProductRequestDTO();
        productRequestDTO1.setOperationName("DiscoveryComponentQuery");
        productRequestDTO1.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO1.setVariables(variables1);

        QueryTokopediaProductRequestDTO.Variable variables2 = new QueryTokopediaProductRequestDTO.Variable();
        variables2.setDevice("desktop");
        variables2.setIdentifier("clp_handphone-tablet_65");
        variables2.setComponentId("25");
        variables2.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO2 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables2);

        QueryTokopediaProductRequestDTO.Variable variables3 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("37");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO3 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables3);

        QueryTokopediaProductRequestDTO.Variable variables4 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("39");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO4 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables4);

        QueryTokopediaProductRequestDTO.Variable variables5 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("57");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO5 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables5);

        QueryTokopediaProductRequestDTO.Variable variables6 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("58");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO6 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables6);

        QueryTokopediaProductRequestDTO.Variable variables7 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("58");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO7 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("DiscoveryComponentQuery");
        productRequestDTO2.setQuery("query DiscoveryComponentQuery($identifier: String!, $componentId: String!, $filters: String, $device: String = \\\"desktop\\\") {\\n  componentInfo(identifier: $identifier, component_id: $componentId, filters: $filters, device: $device) {\\n    data\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables7);

        QueryTokopediaProductRequestDTO.Variable variables8 = new QueryTokopediaProductRequestDTO.Variable();
        variables3.setDevice("desktop");
        variables3.setIdentifier("clp_handphone-tablet_65");
        variables3.setComponentId("58");
        variables3.setFilters("rpc_page_number=1&rpc_page_size=20&rpc_UserAddressId=113188207&rpc_UserCityId=146&rpc_UserDistrictId=1632&rpc_UserLat=-6.184234500000001&rpc_UserLong=106.6671145&rpc_UserPostCode=15141");

        QueryTokopediaProductRequestDTO productRequestDTO8 = new QueryTokopediaProductRequestDTO();
        productRequestDTO2.setOperationName("OvoActivationPopup");
        productRequestDTO2.setQuery("query OvoActivationPopup {\\n  wallet {\\n    tnc_url\\n    help_url\\n    __typename\\n  }\\n}\\n");
        productRequestDTO2.setVariables(variables8);

        List<Map<String, Object>> lists = tokopediaProxy.queryProduct(Arrays.asList(productRequestDTO1,
                productRequestDTO2, productRequestDTO3, productRequestDTO4, productRequestDTO5, productRequestDTO6,
                productRequestDTO7, productRequestDTO8));

        List<TokopediaData> list = Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(lists.get(0)
                .get("data")), Map.class).get("componentInfo")), Map.class).get("data")), Map.class).get("component")), Map.class).get("data")), new TypeReference<List<TokopediaData>>() {
        });

        List<ScrapeProductResponse> result = new ArrayList<>();
        for(TokopediaData tokopediaData : list) {
            ScrapeProductResponse scrapeProductResponse = new ScrapeProductResponse();
            scrapeProductResponse.setProductName(tokopediaData.getName());
            scrapeProductResponse.setImageLink(tokopediaData.getImageUrlDesktop());
            scrapeProductResponse.setPrice(tokopediaData.getPrice());
            scrapeProductResponse.setRating(tokopediaData.getRatingAverage());
            String[] strs = tokopediaData.getShopUrlDesktop().split("/");

            QueryTokopediaProductRequestDTO.Variable shopVariable = new QueryTokopediaProductRequestDTO.Variable();
            shopVariable.setDomain(strs[strs.length - 1]);
            shopVariable.setId(0);


            QueryTokopediaProductRequestDTO merchantDetailRequest = new QueryTokopediaProductRequestDTO();
            merchantDetailRequest.setOperationName("ShopInfoCore");
            merchantDetailRequest.setQuery("query ShopInfoCore($id: Int!, $domain: String) {\n  shopInfoByID(input: {shopIDs: [$id], fields: [\"active_product\", \"address\", \"allow_manage_all\", \"assets\", \"core\", \"closed_info\", \"create_info\", \"favorite\", \"location\", \"status\", \"is_open\", \"other-goldos\", \"shipment\", \"shopstats\", \"shop-snippet\", \"other-shiploc\", \"shopHomeType\", \"branch-link\"], domain: $domain, source: \"shoppage\"}) {\n    result {\n      shopCore {\n        description\n        domain\n        shopID\n        name\n        tagLine\n        defaultSort\n        __typename\n      }\n      createInfo {\n        openSince\n        __typename\n      }\n      favoriteData {\n        totalFavorite\n        alreadyFavorited\n        __typename\n      }\n      activeProduct\n      shopAssets {\n        avatar\n        cover\n        __typename\n      }\n      location\n      isAllowManage\n      branchLinkDomain\n      isOpen\n      address {\n        name\n        id\n        email\n        phone\n        area\n        districtName\n        __typename\n      }\n      shipmentInfo {\n        isAvailable\n        image\n        name\n        product {\n          isAvailable\n          productName\n          uiHidden\n          __typename\n        }\n        __typename\n      }\n      shippingLoc {\n        districtName\n        cityName\n        __typename\n      }\n      shopStats {\n        productSold\n        totalTxSuccess\n        totalShowcase\n        __typename\n      }\n      statusInfo {\n        shopStatus\n        statusMessage\n        statusTitle\n        __typename\n      }\n      closedInfo {\n        closedNote\n        until\n        reason\n        __typename\n      }\n      bbInfo {\n        bbName\n        bbDesc\n        bbNameEN\n        bbDescEN\n        __typename\n      }\n      goldOS {\n        isGold\n        isGoldBadge\n        isOfficial\n        badge\n        shopTier\n        __typename\n      }\n      shopSnippetURL\n      customSEO {\n        title\n        description\n        bottomContent\n        __typename\n      }\n      __typename\n    }\n    error {\n      message\n      __typename\n    }\n    __typename\n  }\n}\n");
            merchantDetailRequest.setVariables(shopVariable);
            List<Map<String, Object>> merchantDetails = tokopediaProxy.queryProduct(Arrays.asList(merchantDetailRequest));

            List<TokopediaShopCore> objects = Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(Util.deserialize(Util.serialize(merchantDetails.get(0).get("data")), Map.class).get("shopInfoByID")), Map.class).get("result")), new TypeReference<List<TokopediaShopCore>>() {
                    });
            TokopediaShopCore tokopediaShopCore = objects.get(0);

            scrapeProductResponse.setMerchantName(tokopediaShopCore.getName());
            scrapeProductResponse.setDescription(tokopediaData.getName());
            result.add(scrapeProductResponse);
        }
        return result;
    }

}
