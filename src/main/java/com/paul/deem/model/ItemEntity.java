package com.paul.deem.model;

import javax.persistence.*;

@Entity
@Table(name = "item", schema = "", catalog = "3.5srd")
public class ItemEntity {
    private int id;
    private String name;
    private String category;
    private String subcategory;
    private String specialAbility;
    private String aura;
    private String casterLevel;
    private String price;
    private String manifesterLevel;
    private String prereq;
    private String cost;
    private String weight;
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
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @Basic
    @Column(name = "special_ability")
    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    @Basic
    @Column(name = "aura")
    public String getAura() {
        return aura;
    }

    public void setAura(String aura) {
        this.aura = aura;
    }

    @Basic
    @Column(name = "caster_level")
    public String getCasterLevel() {
        return casterLevel;
    }

    public void setCasterLevel(String casterLevel) {
        this.casterLevel = casterLevel;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "manifester_level")
    public String getManifesterLevel() {
        return manifesterLevel;
    }

    public void setManifesterLevel(String manifesterLevel) {
        this.manifesterLevel = manifesterLevel;
    }

    @Basic
    @Column(name = "prereq")
    public String getPrereq() {
        return prereq;
    }

    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    @Basic
    @Column(name = "cost")
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

        ItemEntity that = (ItemEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (subcategory != null ? !subcategory.equals(that.subcategory) : that.subcategory != null) return false;
        if (specialAbility != null ? !specialAbility.equals(that.specialAbility) : that.specialAbility != null)
            return false;
        if (aura != null ? !aura.equals(that.aura) : that.aura != null) return false;
        if (casterLevel != null ? !casterLevel.equals(that.casterLevel) : that.casterLevel != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (manifesterLevel != null ? !manifesterLevel.equals(that.manifesterLevel) : that.manifesterLevel != null)
            return false;
        if (prereq != null ? !prereq.equals(that.prereq) : that.prereq != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (subcategory != null ? subcategory.hashCode() : 0);
        result = 31 * result + (specialAbility != null ? specialAbility.hashCode() : 0);
        result = 31 * result + (aura != null ? aura.hashCode() : 0);
        result = 31 * result + (casterLevel != null ? casterLevel.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (manifesterLevel != null ? manifesterLevel.hashCode() : 0);
        result = 31 * result + (prereq != null ? prereq.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
