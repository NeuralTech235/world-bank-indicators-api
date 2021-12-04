package br.com.assw.worldbankindicators.api.service.impl;

import br.com.assw.worldbankindicators.api.controller.api.IndicatorsApi;
import br.com.assw.worldbankindicators.api.service.WBIndicatorsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WBIndicatorsImpl implements WBIndicatorsService {
    @Override
    public IndicatorsApi getIndicatorsByCountryCodeAndHistoryIdx(String countryCode, String historyIdx) {
        return null;
    }
}
