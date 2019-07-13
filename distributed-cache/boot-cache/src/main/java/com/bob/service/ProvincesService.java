package com.bob.service;

import com.bob.entity.Provinces;

import java.util.List;

public interface ProvincesService {
    List<Provinces> list();
    Provinces detail(String id);
    Provinces update(Provinces entity);
    Provinces add(Provinces entity);
    void delete(String id);
}