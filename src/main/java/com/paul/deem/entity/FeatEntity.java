package com.paul.deem.entity;

import javax.persistence.*;

@Entity
@Table(name = "feat", schema = "", catalog = "3.5srd")
public class FeatEntity {
    private int id;
    private String name;
    private String engine;
    private String multiple;
    private String stack;
    private String choice;
    private String prerequisite;
    private String benefit;
    private String normal;
    private String special;
    private String fullText;
    private String reference;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "multiple")
    public String getMultiple() {
        return multiple;
    }

    public void setMultiple(String multiple) {
        this.multiple = multiple;
    }

    @Basic
    @Column(name = "stack")
    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Basic
    @Column(name = "choice")
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Basic
    @Column(name = "prerequisite")
    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    @Basic
    @Column(name = "benefit")
    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    @Basic
    @Column(name = "normal")
    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    @Basic
    @Column(name = "special")
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Basic
    @Column(name = "full_text")
    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    @Basic
    @Column(name = "reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatEntity that = (FeatEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (multiple != null ? !multiple.equals(that.multiple) : that.multiple != null) return false;
        if (stack != null ? !stack.equals(that.stack) : that.stack != null) return false;
        if (choice != null ? !choice.equals(that.choice) : that.choice != null) return false;
        if (prerequisite != null ? !prerequisite.equals(that.prerequisite) : that.prerequisite != null) return false;
        if (benefit != null ? !benefit.equals(that.benefit) : that.benefit != null) return false;
        if (normal != null ? !normal.equals(that.normal) : that.normal != null) return false;
        if (special != null ? !special.equals(that.special) : that.special != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (multiple != null ? multiple.hashCode() : 0);
        result = 31 * result + (stack != null ? stack.hashCode() : 0);
        result = 31 * result + (choice != null ? choice.hashCode() : 0);
        result = 31 * result + (prerequisite != null ? prerequisite.hashCode() : 0);
        result = 31 * result + (benefit != null ? benefit.hashCode() : 0);
        result = 31 * result + (normal != null ? normal.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
