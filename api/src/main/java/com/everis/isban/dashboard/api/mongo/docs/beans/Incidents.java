package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Incidents.
 * Clase con detalle de incidencias.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Incidents {

    /** The external. */
    @Field("externas")
    private BigInteger external;

    /** The internal. */
    @Field("internas")
    private BigInteger internal;

    /** The internal by total. */
    @Field("internasPorTotal")
    private BigDecimal internalByTotal;

}
