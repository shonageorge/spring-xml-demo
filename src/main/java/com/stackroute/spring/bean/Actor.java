package com.stackroute.spring.bean;

public class Actor {
    String actorName;
    int actorAge;
    String actorGender;



    public Actor(){}

    public Actor(String actorName, int actorAge, String actorGender) {
        this.actorName = actorName;
        this.actorAge = actorAge;
        this.actorGender = actorGender;
    }

    public String getActorName() {
        return actorName;
    }

    public int getActorAge() {
        return actorAge;
    }

    public String getActorGender() {
        return actorGender;
    }

    @Override
    public String toString() {
        return "{" +
                "actorName='" + actorName + '\'' +
                ", actorAge=" + actorAge +
                ", actorGender='" + actorGender + '\'' +
                '}';
    }
}
