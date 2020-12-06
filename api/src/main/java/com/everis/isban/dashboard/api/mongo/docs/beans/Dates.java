package com.everis.isban.dashboard.api.mongo.docs.beans;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Dates.
 * Clase que representa a las fechas de inicio y fin en Mongo.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dates {

    /** The start. */
    @Field("inicio")
    private LocalDate start;

    /** The end. */
    @Field("fin")
    private LocalDate end;

}
