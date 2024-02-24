package com.ocms.utils;

import org.modelmapper.ModelMapper;

public class ModelMapperObject {
    private static ModelMapper mapper;

    private ModelMapperObject() {
        mapper = new ModelMapper();
    }

    public static ModelMapper getInstance(){
        if(mapper == null){
            mapper = new ModelMapper();
        }
        return mapper;
    }
}