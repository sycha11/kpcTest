package com.ssafy.kpc.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class UserDto {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String userName;
    private String userPwd;
    private String emailId;
    private String emailDomain;
    private String joinDate;

}
