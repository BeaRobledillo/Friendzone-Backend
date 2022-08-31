package com.equipobeta.friendzone.events;


import com.equipobeta.friendzone.users.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Set;

@Entity

@Getter
@Setter


public class Event implements Serializable{

    @Serial
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Date event_date;
    private Time hour;
    private String location;
    private float budget;
    private String description;
    private String image;

//    @ManyToMany(mappedBy = "events")
//    private Collection <User> members;

    @ManyToMany(mappedBy = "eventMembers")
    Set<User> members;

    @ManyToOne
    @JoinColumn(name="owner_id, nullable=false")
    private User owner;

    public Event(){

    }

    public Event(Long id, String name, Date event_date, String location, float budget, String description, String image, Time hour) {
        this.id = id;
        this.name = name;
        this.event_date = event_date;
        this.location = location;
        this.budget = budget;
        this.description = description;
        this.image = image;
        this.hour = hour;
    }

    public Event(String name, Date event_date, String location, float budget, String description, String image, Time hour) {
        this.name = name;
        this.event_date = event_date;
        this.location = location;
        this.budget = budget;
        this.description = description;
        this.image = image;
        this.hour = hour;
    }

    public Event(long l, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
    }
}
