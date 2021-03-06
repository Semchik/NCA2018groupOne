package ncadvanced2018.groupeone.parent.model.entity.impl;

import lombok.Data;
import ncadvanced2018.groupeone.parent.model.entity.FulfillmentOrder;
import ncadvanced2018.groupeone.parent.model.entity.Order;
import ncadvanced2018.groupeone.parent.model.entity.User;

import java.time.LocalDateTime;

@Data
public class RealFulfillmentOrder implements FulfillmentOrder {
    private Long id;
    private Order order;
    private User ccagent;
    private User courier;
    private LocalDateTime confirmationTime;
    private LocalDateTime receivingTime;
    private LocalDateTime shippingTime;
    private Integer attempt;
}
