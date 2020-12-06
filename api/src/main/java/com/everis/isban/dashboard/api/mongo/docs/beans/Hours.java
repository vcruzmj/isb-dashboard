package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Hours.
 * Clase que representa las horas en detalle de mongo.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hours {

    /** The automation. */
    @Field("automatizacion")
    private BigDecimal automation;

    /** The cdp. */
    @Field("cdp")
    private BigDecimal cdp;

    /** The etc. */
    @Field("etc")
    private BigDecimal etc;

    /** The sale. */
    @Field("venta")
    private BigDecimal sale;

    /** The analysis. */
    @Field("analisis")
    private HoursDetail analysis;

    /** The construction. */
    @Field("construccion")
    private HoursDetail construction;

    /** The deployment. */
    @Field("despliegue")
    private HoursDetail deployment;

    /** The estimated. */
    @Field("estimado")
    private Estimated estimated;

    /** The incurred. */
    @Field("incurridos")
    private Incurred incurred;

    /** The management. */
    @Field("gestion")
    private HoursDetail management;

    /** The tests. */
    @Field("pruebas")
    private HoursDetail tests;

    /** The tests T. */
    @Field("pruebasT")
    private HoursDetail testsT;

    /** The testing. */
    @Field("testing")
    private HoursDetail testing;

}
