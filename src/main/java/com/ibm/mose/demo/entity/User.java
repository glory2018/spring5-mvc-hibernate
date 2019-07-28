package com.ibm.mose.demo.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * User entity. @author Moses modify Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "test")
public class User implements java.io.Serializable {
    // Fields
    private Long id;
    private Integer age;
    private String email;
    private String name;
    private String password;
    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(Long id, Integer age, String email, String name, String password) {
        this.id = id;
        this.age = age;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "age")
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "email", length = 50, unique = true)
    @Email(message = "{user.email.invalid}")
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "name", length = 30)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "password", length = 30)
    @Size(max = 20, min = 3, message = "{user.password.invalid}")
    @NotEmpty(message = "Please Enter your password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}