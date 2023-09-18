package com.abyaz;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer-id-sequence",
            sequenceName = "customer-id-sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer-id-sequence"
    )
    private Integer _id;
    private String _name;
    private String _email;
    private Integer _age;


    public Customer(Integer id,String name, String email, Integer age){
        this._name = name;
        this._email = email;
        this._age = age;
        this._id = id;
    }

    public Customer() {
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_id() {
        return _id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return _age == customer._age && _id == customer._id && Objects.equals(_name, customer._name) && Objects.equals(_email, customer._email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _email, _age, _id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "_name='" + _name + '\'' +
                ", _email='" + _email + '\'' +
                ", _age=" + _age +
                ", _id=" + _id +
                '}';
    }
}
