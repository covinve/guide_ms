package com.courier.guias_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class State {
    @Id
    private String idState;
    private String idGuide;
    private String descriptionState;
    private Date dateState;

    public State(String idState, String idGuide, String descriptionState, Date dateState) {
        this.idState = idState;
        this.idGuide = idGuide;
        this.descriptionState = descriptionState;
        this.dateState = dateState;
    }

    public String getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(String idGuide) {
        this.idGuide = idGuide;
    }

    public String getIdState() {
        return idState;
    }

    public void setIdState(String idState) {
        this.idState = idState;
    }

    public String getDescriptionState() {
        return descriptionState;
    }

    public void setDescriptionState(String descriptionState) {
        this.descriptionState = descriptionState;
    }

    public Date getDateState() {
        return dateState;
    }

    public void setDateState(Date dateState) {
        this.dateState = dateState;
    }
}
