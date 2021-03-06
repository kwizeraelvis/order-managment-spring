package com.elvis.springapp.ordermanager.domain;

public class Order implements Identifiable{
    private Long id;
    private String description;
    private long costInCents;
    private boolean isComplete;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(long costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void markIncomplete(){
        setComplete(false);
    }

    public void markcomplete(){
        setComplete(true);
    }
}
