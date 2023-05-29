package de.kozdemir.binanceApi.service;

import de.kozdemir.binanceApi.converter.AvgPriceDtoConverter;
import de.kozdemir.binanceApi.dto.AvgPriceDto;
import de.kozdemir.binanceApi.model.AvgPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Service
public class BitcoinService {
    private final RestTemplate restTemplate;
    private final AvgPriceDtoConverter converter;
    public BitcoinService(RestTemplate restTemplate, AvgPriceDtoConverter converter){
        this.restTemplate=restTemplate;
        this.converter = converter;
    }

    public AvgPriceDto getAvgPrice(String symbol){
        AvgPrice avgPrice = restTemplate.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol="+symbol,AvgPrice.class);
        avgPrice.setSymbol(symbol);
        return converter.convert(avgPrice);
    }
}
