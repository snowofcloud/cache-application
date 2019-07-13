package com.bob.service;

import com.bob.dao.CitiesDao;
import com.bob.dao.ProvincesDao;
import com.bob.entity.Provinces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 原始实现
 */
//@Service("provincesService")
public class ProvincesServiceImpl implements ProvincesService{

    @Autowired
    private ProvincesDao provincesDao;
    @Autowired
    private CitiesDao citiesDao;

    public List<Provinces> list(){
        return provincesDao.list();
    }

    @Override
    public Provinces detail(String provinceid) {
        Provinces provinces = null;

        System.out.println("数据库中得到数据--------"+System.currentTimeMillis());
        provinces = provincesDao.detail(provinceid);
        if (null != provinces){
            provinces.setCities(citiesDao.list(provinceid));
        }

        return provinces;
    }

    @Override
    public Provinces update(Provinces entity) {
        provincesDao.update(entity);
        return entity;
    }

    @Override
    public Provinces add(Provinces entity) {
        provincesDao.insert(entity);
        return entity;
    }

    @Override
    public void delete(String provinceid) {
        provincesDao.delete(provinceid);
    }


}