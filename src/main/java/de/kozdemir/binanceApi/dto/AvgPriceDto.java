package de.kozdemir.binanceApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Data
@AllArgsConstructor
public class AvgPriceDto {
    private int mins;
    private BigDecimal price;
    private String symbol;
}
