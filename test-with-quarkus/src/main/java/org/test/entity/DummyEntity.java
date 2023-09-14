package org.test.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Cacheable
@Table(name = "dummy")
public class DummyEntity extends PanacheEntityBase {
    @Id
    public String dummy_col1;
    public String dummy_col2;
    public String dummy_col3;

    public DummyEntity() {
    }
    
    public void setDummyCol1(String dummy_col1) {
        this.dummy_col1 = dummy_col1;
    }

    public void setDummyCol2(String dummy_col2) {
        this.dummy_col2 = dummy_col2;
    }

    public void setDummyCol3(String dummy_col3) {
        this.dummy_col3 = dummy_col3;
    }
}