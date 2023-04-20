package org.sentinel.disaster_recovery_api.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name", length = 50)
    @NotBlank(message = "Please enter the user's name")
    private String name;

    @Column(name = "email")
    @Email
    @NotBlank(message = "Please enter the user's email address")
    private String email;

    @Column(name = "username")
    @NotBlank(message = "Please enter the user's username")
    private String username;

    @Column(name = "password")
    @NotBlank(message = "Please enter the user's password")
    private String password;

    @OneToOne()
    private Role role;

    public User(){}

    public User(String name, String email, String username, String password, Role role){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }


}
