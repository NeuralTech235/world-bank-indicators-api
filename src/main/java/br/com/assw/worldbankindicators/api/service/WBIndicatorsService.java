package br.com.assw.worldbankindicators.api.service;

import br.com.assw.worldbankindicators.api.controller.api.IndicatorsApi;
import org.springframework.stereotype.Service;

@Service
public interface WBIndicatorsService {
    public IndicatorsApi getIndicatorsByCountryCodeAndHistoryIdx(final String countryCode, final String historyIdx);
}
