package com.vk.javann.data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Payment report containing payments to employees
 */
@XmlRootElement
public class PaymentReport {

    private Date date;

    private List<Ticket> tickets;

    public Date getDate() {
        return date;
    }

    @XmlAttribute
    public void setDate(Date date) {
        this.date = date;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @XmlElement(name = "ticket")
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
