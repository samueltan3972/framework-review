package com.example.model;

//import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "fruit")
public class Fruit{
	@Id
	public int id;
	public int fruit_label;
    public String fruit_name;
    public String fruit_subtype;
    public double mass;
    public double width;
    public double height;
    public double color_score;
}
