/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DignitiesValue 
        implements java.io.Serializable {
    private static final long serialVersionUID = -3497916231553570496L;
    private int rulerId;
    private int score;
    private int typeId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("rulerId")
    public int getRulerId ( ) { 
        return this.rulerId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("rulerId")
    public void setRulerId (int value) { 
        this.rulerId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("score")
    public int getScore ( ) { 
        return this.score;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("score")
    public void setScore (int value) { 
        this.score = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("typeId")
    public int getTypeId ( ) { 
        return this.typeId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("typeId")
    public void setTypeId (int value) { 
        this.typeId = value;
    }
 
}
