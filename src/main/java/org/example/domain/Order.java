package org.example.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDate orderDate;

    // enum일 경우 이렇게 애노테이션을 사용해야 한다.
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
