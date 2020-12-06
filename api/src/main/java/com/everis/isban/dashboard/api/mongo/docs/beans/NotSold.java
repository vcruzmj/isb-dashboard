package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class NotSold.
 * Clase con cambios no vendidos.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotSold {

    /** The percentage. */
    @Field("porcentaje")
    private BigDecimal percentage;

    /** The value. */
    @Field("valor")
    private BigDecimal value;

}
