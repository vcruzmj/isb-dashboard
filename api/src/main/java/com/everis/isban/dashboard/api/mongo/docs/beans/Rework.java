package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * The Class Rework.
 * Clase con el detalle del retrabajo
 * 
 * @author Manuel J. Vasquez Cruz.
 */
public class Rework {

    /** The internal. */
    @Field("interno")
    private BigDecimal internal;

    /** The external. */
    @Field("externo")
    private BigDecimal external;
}
