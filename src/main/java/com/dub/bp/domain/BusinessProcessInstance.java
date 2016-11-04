package com.dub.bp.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Igor_Strakhov
 */
public class BusinessProcessInstance {

    @Id
    private String idBPInstance;

    private String name;

    public BusinessProcessInstance() {
    }

    public String getIdBPInstance() {
        return idBPInstance;
    }

    public void setIdBPInstance(String idBPInstance) {
        this.idBPInstance = idBPInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
