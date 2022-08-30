package com.devglan.userportal.services;

import com.devglan.userportal.model.ScheduleModel;
import java.util.List;


public interface ScheduleServices {
    ScheduleModel create(ScheduleModel user);

    ScheduleModel delete(int id);

    List<ScheduleModel> findAll();

    ScheduleModel findById(int id);

    ScheduleModel update(ScheduleModel user);
}
