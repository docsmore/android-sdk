/*
 * DOCSMOREAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.docsmore.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAuthTOKENResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4664972991109830654L;
    private String accessToken;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("access_token")
    public String getAccessToken ( ) { 
        return this.accessToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("access_token")
    public void setAccessToken (String value) { 
        this.accessToken = value;
        notifyObservers(this.accessToken);
    }
 
}
 