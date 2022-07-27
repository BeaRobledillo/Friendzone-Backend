package com.equipobeta.friendzone.users;

import com.equipobeta.friendzone.auth.role.Role;
import com.equipobeta.friendzone.events.Event;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Username is required")
    @Size(max = 20)
    private String username;
    @NotBlank(message = "Name is required")
    @Size(max = 20)
    private String name;
    @NotBlank(message = "Password is required")
    @Size(max = 150)
    private String password;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinTable(
            name = "owner",
            joinColumns = @JoinColumn(
                    name = "user_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "event_id"))
    private Collection <Event> events;

    @OneToMany(mappedBy = "owner")
    @JsonIgnore
    private Set<Event> event;

    public User() {

    }

    public User(  String username,String name,String email, String password   ) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;

    }

}
