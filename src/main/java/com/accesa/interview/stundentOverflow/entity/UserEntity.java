package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private Integer tokens;
    @Column
    private Integer badges;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<QuestEntity> quest;

    public UserEntity(Integer userId, String userName, String email, Integer tokens, Integer badges) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
    }

    public UserEntity() {

    }
}
