package com.everis.isban.dashboard.api.mongo.docs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.everis.isban.dashboard.api.mongo.docs.beans.Changes;
import com.everis.isban.dashboard.api.mongo.docs.beans.Efficiency;
import com.everis.isban.dashboard.api.mongo.docs.beans.Hours;
import com.everis.isban.dashboard.api.mongo.docs.beans.Incidents;
import com.everis.isban.dashboard.api.mongo.docs.beans.Request;
import com.everis.isban.dashboard.api.mongo.docs.beans.Rework;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class GeneralDocument.
 * Clase que representa el documento de mongo que contiene las propiedades de la pestaña general del cuadro de mando.
 * 
 * @author Manuel J. Vasquez Cruz
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("documentos-generales")
public class GeneralDocument {

    /** The id. */
    @Id
    private String id;

    /** The request. */
    @Field("peticion")
    private Request request;

    /** The hours. */
    @Field("horas")
    private Hours hours;

    /** The efficiency. */
    @Field("eficiencia")
    private Efficiency efficiency;

    /** The changes. */
    @Field("cambios")
    private Changes changes;

    /** The incidents. */
    @Field("incidencias")
    private Incidents incidents;

    /** The rework. */
    @Field("retrabajo")
    private Rework rework;
}
