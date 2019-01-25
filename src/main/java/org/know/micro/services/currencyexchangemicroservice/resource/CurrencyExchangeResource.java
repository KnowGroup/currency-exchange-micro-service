package org.know.micro.services.currencyexchangemicroservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.know.micro.services.currencyexchangemicroservice.model.ExchangeValue;
import org.know.micro.services.currencyexchangemicroservice.repo.ExchangeValueRepo;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author KnowGroup
 */
@RestController
public class CurrencyExchangeResource {
    
    @Autowired
    private ExchangeValueRepo repo;
    
    @Autowired
    private Environment environment;
    
    /**
     *
     * @param from
     * @param to
     * @return
     */
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue exchangeConversionRate(@PathVariable String from, 
            @PathVariable String to){
        final ExchangeValue exchange = repo.findByFromAndTo(from,to);
        exchange.setPort(Integer.valueOf(environment.getProperty("server.port")));
        return exchange;
    }

}
