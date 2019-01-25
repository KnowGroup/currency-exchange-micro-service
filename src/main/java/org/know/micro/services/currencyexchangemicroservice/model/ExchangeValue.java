package org.know.micro.services.currencyexchangemicroservice.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KnowGroup
 */
@Entity(name = "EXCHANGE_VALUE")
public class ExchangeValue implements Serializable {

    @Id
    private Integer id;
    
    @Column(name = "FROM_CURRENCY")
    private String from;
    
    @Column(name = "TO_CURRENCY")
    private String to;
    
    @Column(name = "CONVERSION")
    private BigInteger conversionMultiple;
    private Integer port;

    public ExchangeValue() {
    }

    public ExchangeValue(Integer id, String from, String to, BigInteger conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigInteger getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigInteger conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
}
