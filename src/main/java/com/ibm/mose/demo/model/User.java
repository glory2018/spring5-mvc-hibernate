package com.ibm.mose.demo.model;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
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
  // Constructors
  /** default constructor */
  public User() {
  }
  /** full constructor */
  public User(Integer age, String email, String name) {
    this.age = age;
    this.email = email;
    this.name = name;
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
  @NotEmpty(message = "Please Enter your email")
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
}