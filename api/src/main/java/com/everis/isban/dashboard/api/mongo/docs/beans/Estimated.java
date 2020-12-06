package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Estimated.
 * Clase con el detalle del estimado.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Estimated {

    /** The internal. */
    @Field("interno")
    private BigDecimal internal;

    /** The sum. */
    @Field("sum")
    private BigDecimal sum;
}
