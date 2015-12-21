package com.vk.javann;

import com.vk.javann.data.PaymentReport;
import com.vk.javann.data.Ticket;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Generates random payment report
 */
public class ReportGenerator implements Processor {
    private final static String[] expenseItems = {"businesstrip", "prepayment", "cash", "other"};

    @Override
    public void process(Exchange exchange) throws Exception {
        PaymentReport report = new PaymentReport();
        report.setDate(new Date());
        List<Ticket> tickets = new ArrayList<>();

        int ticketAmout = randomInt(3, 15);
        for (int i = 0; i < ticketAmout; i++) {
            Ticket t = new Ticket();
            t.setAmount(randomInt(1000, 15000));
            t.setExpenseItem(expenseItems[randomInt(0, expenseItems.length - 1)]);
            t.setAccountNumber("0000000000000000000" + randomInt(0, 3));
            tickets.add(t);
        }

        report.setTickets(tickets);

        exchange.getOut().setBody(report);
    }

    private static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
