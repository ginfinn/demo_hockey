package com.example.demo_hockey.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Arena {
    @Id
    String name;
    String image;
    String site;
    String coordinates;
    String workingHours;
    String instagram;
    String vk;
    String telegram;
    String youtube;
    
    @OneToMany(cascade = {CascadeType.ALL})
    List<Image> images;
    @OneToMany(cascade = {CascadeType.ALL})
    List<Additional> additionals;
}
