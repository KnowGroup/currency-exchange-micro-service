package org.know.micro.services.currencyexchangemicroservice.repo;

import org.know.micro.services.currencyexchangemicroservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KnowGroup
 */
public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Integer>{

    public ExchangeValue findByFromAndTo(String from, String to);

}
