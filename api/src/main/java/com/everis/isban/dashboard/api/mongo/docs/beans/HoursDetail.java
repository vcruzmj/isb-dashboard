package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class HoursDetail.
 * Clase que contiene los detalles de horas.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoursDetail {

    /** The value. */
    @Field("valor")
    private BigDecimal value;

    /** The efficiency. */
    @Field("eficiencia")
    private BigDecimal efficiency;

    /** The percentage. */
    @Field("porcentaje")
    private BigDecimal percentage;

}
