package com.devglan.userportal.model;

abstract class ActivityModel {
    public abstract String getActivities();
    public abstract String getActivity(String day);
    public abstract void createActivity(String activity, String day);
    public abstract int updateActivity(int id);
    public abstract void deleteActivity(int id);
}
