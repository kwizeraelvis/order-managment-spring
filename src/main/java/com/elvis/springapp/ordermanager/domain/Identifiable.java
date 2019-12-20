package com.elvis.springapp.ordermanager.domain;

public interface Identifiable<T>{
    public void setId(T id);
    public T getId();
}
