package com.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;
@Column(name="Year")
private int publicyear;
private int totalcopy;
private int availablecopies;

@ManyToOne(cascade=CascadeType.PERSIST)
private Publisher publisher;



}