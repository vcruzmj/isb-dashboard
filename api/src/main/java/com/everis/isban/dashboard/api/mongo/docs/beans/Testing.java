package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Testing.
 * Clase con el detalle de testing.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Testing {

    /** The estimated. */
    @Field("estimado")
    private BigDecimal estimated;

    /** The incurred. */
    @Field("incurrido")
    private BigDecimal incurred;

    /** The participation. */
    @Field("participacion")
    private String participation;
}
