package com.paul.deem.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "power", schema = "", catalog = "3.5srd")
public class PowerEntity {
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

    private String discipline;

    @Basic
    @javax.persistence.Column(name = "discipline")
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    private String subdiscipline;

    @Basic
    @javax.persistence.Column(name = "subdiscipline")
    public String getSubdiscipline() {
        return subdiscipline;
    }

    public void setSubdiscipline(String subdiscipline) {
        this.subdiscipline = subdiscipline;
    }

    private String descriptor;

    @Basic
    @javax.persistence.Column(name = "descriptor")
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    private String level;

    @Basic
    @javax.persistence.Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String display;

    @Basic
    @javax.persistence.Column(name = "display")
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    private String manifestingTime;

    @Basic
    @javax.persistence.Column(name = "manifesting_time")
    public String getManifestingTime() {
        return manifestingTime;
    }

    public void setManifestingTime(String manifestingTime) {
        this.manifestingTime = manifestingTime;
    }

    private String powerRange;

    @Basic
    @javax.persistence.Column(name = "power_range")
    public String getPowerRange() {
        return powerRange;
    }

    public void setPowerRange(String powerRange) {
        this.powerRange = powerRange;
    }

    private String target;

    @Basic
    @javax.persistence.Column(name = "target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    private String area;

    @Basic
    @javax.persistence.Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String effect;

    @Basic
    @javax.persistence.Column(name = "effect")
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    private String duration;

    @Basic
    @javax.persistence.Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    private String savingThrow;

    @Basic
    @javax.persistence.Column(name = "saving_throw")
    public String getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(String savingThrow) {
        this.savingThrow = savingThrow;
    }

    private String powerPoints;

    @Basic
    @javax.persistence.Column(name = "power_points")
    public String getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(String powerPoints) {
        this.powerPoints = powerPoints;
    }

    private String powerResistance;

    @Basic
    @javax.persistence.Column(name = "power_resistance")
    public String getPowerResistance() {
        return powerResistance;
    }

    public void setPowerResistance(String powerResistance) {
        this.powerResistance = powerResistance;
    }

    private String shortDescription;

    @Basic
    @javax.persistence.Column(name = "short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    private String xpCost;

    @Basic
    @javax.persistence.Column(name = "xp_cost")
    public String getXpCost() {
        return xpCost;
    }

    public void setXpCost(String xpCost) {
        this.xpCost = xpCost;
    }

    private String description;

    @Basic
    @javax.persistence.Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String augment;

    @Basic
    @javax.persistence.Column(name = "augment")
    public String getAugment() {
        return augment;
    }

    public void setAugment(String augment) {
        this.augment = augment;
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

        PowerEntity that = (PowerEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (discipline != null ? !discipline.equals(that.discipline) : that.discipline != null) return false;
        if (subdiscipline != null ? !subdiscipline.equals(that.subdiscipline) : that.subdiscipline != null)
            return false;
        if (descriptor != null ? !descriptor.equals(that.descriptor) : that.descriptor != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (display != null ? !display.equals(that.display) : that.display != null) return false;
        if (manifestingTime != null ? !manifestingTime.equals(that.manifestingTime) : that.manifestingTime != null)
            return false;
        if (powerRange != null ? !powerRange.equals(that.powerRange) : that.powerRange != null) return false;
        if (target != null ? !target.equals(that.target) : that.target != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (savingThrow != null ? !savingThrow.equals(that.savingThrow) : that.savingThrow != null) return false;
        if (powerPoints != null ? !powerPoints.equals(that.powerPoints) : that.powerPoints != null) return false;
        if (powerResistance != null ? !powerResistance.equals(that.powerResistance) : that.powerResistance != null)
            return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (xpCost != null ? !xpCost.equals(that.xpCost) : that.xpCost != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (augment != null ? !augment.equals(that.augment) : that.augment != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        result = 31 * result + (subdiscipline != null ? subdiscipline.hashCode() : 0);
        result = 31 * result + (descriptor != null ? descriptor.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (display != null ? display.hashCode() : 0);
        result = 31 * result + (manifestingTime != null ? manifestingTime.hashCode() : 0);
        result = 31 * result + (powerRange != null ? powerRange.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (effect != null ? effect.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (savingThrow != null ? savingThrow.hashCode() : 0);
        result = 31 * result + (powerPoints != null ? powerPoints.hashCode() : 0);
        result = 31 * result + (powerResistance != null ? powerResistance.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (xpCost != null ? xpCost.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (augment != null ? augment.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
