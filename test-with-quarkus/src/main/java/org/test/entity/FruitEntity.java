package org.test.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
@Table(name = "fruit")
public class FruitEntity extends PanacheEntity {
    public int fruit_label;
    public String fruit_name;
    public String fruit_subtype;
    public double mass;
    public double width;
    public double height;
    public double color_score;

    public FruitEntity() {
    }
}