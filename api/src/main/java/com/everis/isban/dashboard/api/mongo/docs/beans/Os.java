package com.everis.isban.dashboard.api.mongo.docs.beans;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Os.
 * Clase que representa a la OS del cliente en Mongo.
 * 
 * @author Manuel J. Vasquez Cruz.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Os {

    /** The informed. */
    @Field("informado")
    private boolean informed;
    
    /** The value. */
    @Field("valor")
    private String value;
    
}
