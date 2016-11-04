package com.dub.bp.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Igor_Strakhov
 */
public class BusinessProcessStep {

    @Id
    private String idStep;

    private String name;

    public BusinessProcessStep() {
    }

    public String getIdStep() {
        return idStep;
    }

    public void setIdStep(String idStep) {
        this.idStep = idStep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
