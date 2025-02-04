package com.fundfun.fundfund.domain.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class order {
    @Id
    private UUID postId;

    private int cost;
    private String orderDate;
    private String status;
    private UUID productId;
    private UUID paymentId;

}
