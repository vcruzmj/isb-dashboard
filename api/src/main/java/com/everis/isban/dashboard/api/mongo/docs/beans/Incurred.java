package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Incurred.
 * Clase con el detalle del incurrido.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Incurred {

    /** The value. */
    @Field("valor")
    private BigDecimal value;

    /** The previous months. */
    @Field("mesesAnteriores")
    private Map<Integer, BigDecimal> previousMonths;

    /** The current moth. */
    @Field("mesActual")
    private BigDecimal currentMoth;

    /** The last days. */
    @Field("ultimosDias")
    private BigDecimal lastDays;

    /** The last days CN. */
    @Field("ultimosDiasCN")
    private BigDecimal lastDaysCN;

}
