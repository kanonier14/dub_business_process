package com.dub.bp.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Igor_Strakhov
 */
public class BusinessProcessTemplate {

    @Id
    private String idBPTemplate;

    private String name;

    public BusinessProcessTemplate() {
    }

    public String getIdBPTemplate() {
        return idBPTemplate;
    }

    public void setIdBPTemplate(String idBPTemplate) {
        this.idBPTemplate = idBPTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
