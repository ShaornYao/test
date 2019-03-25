package com.example.course;

public class ListProvider {
    private String week,lecture,lab,lecturetopic,labtopic;

    public ListProvider (String week,String lecture,String lab,String lecturetopic,String labtopic,String lectureassess,String labassess){

        this.setWeek(week);
        this.setLab(lab);
        this.setLecture(lecture);
        this.setLabtopic(labtopic);
        this.setLecturetopic(lecturetopic);

    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getLecturetopic() {
        return lecturetopic;
    }

    public void setLecturetopic(String lecturetopic) {
        this.lecturetopic = lecturetopic;
    }

    public String getLabtopic() {
        return labtopic;
    }

    public void setLabtopic(String labtopic) {
        this.labtopic = labtopic;
    }


}
