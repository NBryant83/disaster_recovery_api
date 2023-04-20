package org.sentinel.disaster_recovery_api.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "title")
    @NotBlank(message = "Please enter a Role title. The choices are 'Admin', and 'Contractor'")
    private String title;




}
