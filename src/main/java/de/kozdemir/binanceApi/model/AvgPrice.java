package de.kozdemir.binanceApi.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@Data
public class AvgPrice {
    private int mins;
    private BigDecimal price;
    private String symbol;
}
