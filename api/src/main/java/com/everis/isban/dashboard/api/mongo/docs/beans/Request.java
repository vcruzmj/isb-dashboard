package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.time.Month;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Request.
 * Clase que representa la data de la peticion almacenada en mongo.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    /** The jira. */
    @Field("jira")
    private String jira;

    /** The project. */
    @Field("proyecto")
    private String project;

    /** The responsable. */
    @Field("responsable")
    private String responsable;

    /** The os. */
    @Field("os")
    private Os os;

    /** The type. */
    @Field("tipo")
    private String type;

    /** The status. */
    @Field("estado")
    private String status;

    /** The dates. */
    @Field("fechas")
    private Dates dates;

    /** The delivery. */
    @Field("entrega")
    private Month delivery;

    /** The technology. */
    @Field("tecnologia")
    private String technology;

    /** The client. */
    @Field("cliente")
    private String client;

    /** The area. */
    @Field("area")
    private String area;

    /** The subarea. */
    @Field("subarea")
    private String subarea;
}
