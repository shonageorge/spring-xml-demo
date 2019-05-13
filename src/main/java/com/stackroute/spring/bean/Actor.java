package com.stackroute.spring.bean;

public class Actor {
    String actorName;
    int actorAge;
    String actorGender;

    public Actor(){}

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    public String getActorGender() {
        return actorGender;
    }

    public void setActorGender(String actorGender) {
        this.actorGender = actorGender;
    }

    @Override
    public String toString() {
        return "Actor{" +", actorAge="+ actorName + '\'' + ", actorAge=" + actorAge + ", actorGender='" + actorGender + '\'' + '}';
    }
}
