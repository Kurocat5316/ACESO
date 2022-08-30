package com.devglan.userportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.userportal.model.ScheduleModel;
import com.devglan.userportal.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleServicesImpl implements ScheduleServices {

    @Autowired
    private ScheduleRepository repository;

    @Override
    public ScheduleModel create(ScheduleModel user){
        return user;
    };

    @Override
    public ScheduleModel delete(int id){
        ScheduleModel user = new ScheduleModel();
        return user;
    };

    @Override
    public List<ScheduleModel> findAll(){
        System.out.println("123");
        
        List<ScheduleModel> user1 = repository.findAll();
        System.out.println(user1);
        return user1;
    };

    @Override
    public ScheduleModel findById(int id){
        ScheduleModel user = new ScheduleModel();
        return user;
    };

    @Override
    public ScheduleModel update(ScheduleModel user){
        return user;
    };
}