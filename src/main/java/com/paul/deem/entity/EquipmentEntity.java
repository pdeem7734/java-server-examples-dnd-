package com.paul.deem.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "equipment", schema = "", catalog = "3.5srd")
public class EquipmentEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String family;

    @Basic
    @javax.persistence.Column(name = "family")
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    private String category;

    @Basic
    @javax.persistence.Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String subcategory;

    @Basic
    @javax.persistence.Column(name = "subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    private String cost;

    @Basic
    @javax.persistence.Column(name = "cost")
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    private String dmgS;

    @Basic
    @javax.persistence.Column(name = "dmg_s")
    public String getDmgS() {
        return dmgS;
    }

    public void setDmgS(String dmgS) {
        this.dmgS = dmgS;
    }

    private String armorShieldBonus;

    @Basic
    @javax.persistence.Column(name = "armor_shield_bonus")
    public String getArmorShieldBonus() {
        return armorShieldBonus;
    }

    public void setArmorShieldBonus(String armorShieldBonus) {
        this.armorShieldBonus = armorShieldBonus;
    }

    private String maximumDexBonus;

    @Basic
    @javax.persistence.Column(name = "maximum_dex_bonus")
    public String getMaximumDexBonus() {
        return maximumDexBonus;
    }

    public void setMaximumDexBonus(String maximumDexBonus) {
        this.maximumDexBonus = maximumDexBonus;
    }

    private String dmgM;

    @Basic
    @javax.persistence.Column(name = "dmg_m")
    public String getDmgM() {
        return dmgM;
    }

    public void setDmgM(String dmgM) {
        this.dmgM = dmgM;
    }

    private String weight;

    @Basic
    @javax.persistence.Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    private String critical;

    @Basic
    @javax.persistence.Column(name = "critical")
    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    private String armorCheckPenalty;

    @Basic
    @javax.persistence.Column(name = "armor_check_penalty")
    public String getArmorCheckPenalty() {
        return armorCheckPenalty;
    }

    public void setArmorCheckPenalty(String armorCheckPenalty) {
        this.armorCheckPenalty = armorCheckPenalty;
    }

    private String arcaneSpellFailureChance;

    @Basic
    @javax.persistence.Column(name = "arcane_spell_failure_chance")
    public String getArcaneSpellFailureChance() {
        return arcaneSpellFailureChance;
    }

    public void setArcaneSpellFailureChance(String arcaneSpellFailureChance) {
        this.arcaneSpellFailureChance = arcaneSpellFailureChance;
    }

    private String rangeIncrement;

    @Basic
    @javax.persistence.Column(name = "range_increment")
    public String getRangeIncrement() {
        return rangeIncrement;
    }

    public void setRangeIncrement(String rangeIncrement) {
        this.rangeIncrement = rangeIncrement;
    }

    private String speed30;

    @Basic
    @javax.persistence.Column(name = "speed_30")
    public String getSpeed30() {
        return speed30;
    }

    public void setSpeed30(String speed30) {
        this.speed30 = speed30;
    }

    private String engine;

    @Basic
    @javax.persistence.Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String speed20;

    @Basic
    @javax.persistence.Column(name = "speed_20")
    public String getSpeed20() {
        return speed20;
    }

    public void setSpeed20(String speed20) {
        this.speed20 = speed20;
    }

    private String fullText;

    @Basic
    @javax.persistence.Column(name = "full_text")
    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    private String reference;

    @Basic
    @javax.persistence.Column(name = "reference")
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

        EquipmentEntity that = (EquipmentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (family != null ? !family.equals(that.family) : that.family != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (subcategory != null ? !subcategory.equals(that.subcategory) : that.subcategory != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (dmgS != null ? !dmgS.equals(that.dmgS) : that.dmgS != null) return false;
        if (armorShieldBonus != null ? !armorShieldBonus.equals(that.armorShieldBonus) : that.armorShieldBonus != null)
            return false;
        if (maximumDexBonus != null ? !maximumDexBonus.equals(that.maximumDexBonus) : that.maximumDexBonus != null)
            return false;
        if (dmgM != null ? !dmgM.equals(that.dmgM) : that.dmgM != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (critical != null ? !critical.equals(that.critical) : that.critical != null) return false;
        if (armorCheckPenalty != null ? !armorCheckPenalty.equals(that.armorCheckPenalty) : that.armorCheckPenalty != null)
            return false;
        if (arcaneSpellFailureChance != null ? !arcaneSpellFailureChance.equals(that.arcaneSpellFailureChance) : that.arcaneSpellFailureChance != null)
            return false;
        if (rangeIncrement != null ? !rangeIncrement.equals(that.rangeIncrement) : that.rangeIncrement != null)
            return false;
        if (speed30 != null ? !speed30.equals(that.speed30) : that.speed30 != null) return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (speed20 != null ? !speed20.equals(that.speed20) : that.speed20 != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (subcategory != null ? subcategory.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (dmgS != null ? dmgS.hashCode() : 0);
        result = 31 * result + (armorShieldBonus != null ? armorShieldBonus.hashCode() : 0);
        result = 31 * result + (maximumDexBonus != null ? maximumDexBonus.hashCode() : 0);
        result = 31 * result + (dmgM != null ? dmgM.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (critical != null ? critical.hashCode() : 0);
        result = 31 * result + (armorCheckPenalty != null ? armorCheckPenalty.hashCode() : 0);
        result = 31 * result + (arcaneSpellFailureChance != null ? arcaneSpellFailureChance.hashCode() : 0);
        result = 31 * result + (rangeIncrement != null ? rangeIncrement.hashCode() : 0);
        result = 31 * result + (speed30 != null ? speed30.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (speed20 != null ? speed20.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
