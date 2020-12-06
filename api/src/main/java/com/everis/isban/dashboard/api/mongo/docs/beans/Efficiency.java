package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Efficiency.
 * Clase con el detalle de la eficiencia
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Efficiency {

    /** The internal. */
    @Field("interna")
    private BigDecimal internal;

    /** The internal inicial. */
    @Field("internaInicial")
    private BigDecimal internalInicial;

    /** The sale. */
    @Field("venta")
    private BigDecimal sale;
}
