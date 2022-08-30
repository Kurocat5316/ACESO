package com.devglan.userportal.model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_SCHEDULE")
public class ScheduleModel {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;
    @Column
    private String activity;
    @Column
    private String daysId;

    public int getId() {
        return scheduleId;
    }

    public void setId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getActivity() {
        return activity;
    }

    public void setFirstName(String activity) {
        this.activity = activity;
    }
    public String getDaysId(){
        return daysId;
    }

}
