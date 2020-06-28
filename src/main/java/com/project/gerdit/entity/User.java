package com.project.gerdit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private Date creationDate;

    private Date lastAccessDate;

    private boolean enabled;

    @ManyToMany
    private Set<Role> roles = new HashSet<Role>();
}
