package com.devglan.userportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.devglan.userportal.model.ScheduleModel;
import com.devglan.userportal.services.ScheduleServices;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/schedule"})
public class ScheduleController {

    @Autowired
    private ScheduleServices scheduleServices;

    @PostMapping
    public ScheduleModel create(@RequestBody ScheduleModel user){
        return scheduleServices.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public ScheduleModel findOne(@PathVariable("id") int id){
        System.out.println(id);
        return scheduleServices.findById(id);
    }

    @PutMapping
    public ScheduleModel update(@RequestBody ScheduleModel user){
        return scheduleServices.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public ScheduleModel delete(@PathVariable("id") int id) {
        return scheduleServices.delete(id);
    }

    @GetMapping
    public List<ScheduleModel> findAll(){
        return scheduleServices.findAll();
    }
}
