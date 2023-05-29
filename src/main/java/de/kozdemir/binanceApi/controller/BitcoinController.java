package de.kozdemir.binanceApi.controller;

import de.kozdemir.binanceApi.dto.AvgPriceDto;
import de.kozdemir.binanceApi.service.BitcoinService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By hasan
 * Date : 28.05.2023
 */
@RestController
@RequestMapping("/v1/bitcoin")
public class BitcoinController {

    private final BitcoinService bitcoinService;
    public BitcoinController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GetMapping("/avgPrice/{symbol}")
    ResponseEntity<AvgPriceDto> getAvgPrice(@PathVariable String symbol){
        return ResponseEntity.ok(bitcoinService.getAvgPrice(symbol));
    }
}
