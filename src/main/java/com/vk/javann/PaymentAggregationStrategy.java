package com.vk.javann;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

/**
 * Aggregates all payment amounts per account
 */
public class PaymentAggregationStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        final Integer oldAmount = oldExchange.getIn().getHeader("amount", Integer.class);
        final Integer newAmount = newExchange.getIn().getHeader("amount", Integer.class);
        oldExchange.getIn().setHeader("amount", oldAmount + newAmount);
        return oldExchange;
    }
}
