package de.kozdemir.binanceApi.converter;

import de.kozdemir.binanceApi.dto.AvgPriceDto;
import de.kozdemir.binanceApi.model.AvgPrice;
import org.springframework.stereotype.Component;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrice(), from.getSymbol());
    }
}
