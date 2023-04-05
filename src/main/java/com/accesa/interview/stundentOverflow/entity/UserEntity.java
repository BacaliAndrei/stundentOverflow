package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column
    private Integer tokens;
    @Column
    private Integer badges;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @MapKey(name = "questId")
    private QuestEntity quest;

    public UserEntity(Integer userId, String username, String email, Integer tokens, Integer badges) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
    }

    public UserEntity() {

    }
}
