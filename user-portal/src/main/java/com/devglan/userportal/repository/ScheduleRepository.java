package com.devglan.userportal.repository;

import org.springframework.data.repository.Repository;

import com.devglan.userportal.model.ScheduleModel;

import java.util.List;

public interface ScheduleRepository extends Repository<ScheduleModel, Integer> {

    void delete(ScheduleModel user);

    List<ScheduleModel> findAll();

    ScheduleModel findOne(int id);

    ScheduleModel save(ScheduleModel user);
}