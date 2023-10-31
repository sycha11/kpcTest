package com.ssafy.kpc.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class DongCodeDto {

    @Id @GeneratedValue
    @Column(name = "dongCode")
    private String dongCode;

    private String sidoName;
    private String gugunName;
    private String dongName;

}
