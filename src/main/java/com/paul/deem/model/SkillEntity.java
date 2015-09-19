package com.paul.deem.model;

import javax.persistence.*;

@Entity
@Table(name = "skill", schema = "", catalog = "3.5srd")
public class SkillEntity {
    private int id;
    private String name;
    private String subEngine;
    private String keyAbility;
    private String psionic;
    private String trained;
    private String armorCheck;
    private String description;
    private String skillCheck;
    private String action;
    private String tryAgain;
    private String special;
    private String restriction;
    private String synergy;
    private String epicUse;
    private String untrained;
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
    @Column(name = "subENGINE")
    public String getSubEngine() {
        return subEngine;
    }

    public void setSubEngine(String subEngine) {
        this.subEngine = subEngine;
    }

    @Basic
    @Column(name = "key_ability")
    public String getKeyAbility() {
        return keyAbility;
    }

    public void setKeyAbility(String keyAbility) {
        this.keyAbility = keyAbility;
    }

    @Basic
    @Column(name = "psionic")
    public String getPsionic() {
        return psionic;
    }

    public void setPsionic(String psionic) {
        this.psionic = psionic;
    }

    @Basic
    @Column(name = "trained")
    public String getTrained() {
        return trained;
    }

    public void setTrained(String trained) {
        this.trained = trained;
    }

    @Basic
    @Column(name = "armor_check")
    public String getArmorCheck() {
        return armorCheck;
    }

    public void setArmorCheck(String armorCheck) {
        this.armorCheck = armorCheck;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "skill_check")
    public String getSkillCheck() {
        return skillCheck;
    }

    public void setSkillCheck(String skillCheck) {
        this.skillCheck = skillCheck;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "try_again")
    public String getTryAgain() {
        return tryAgain;
    }

    public void setTryAgain(String tryAgain) {
        this.tryAgain = tryAgain;
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
    @Column(name = "restriction")
    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    @Basic
    @Column(name = "synergy")
    public String getSynergy() {
        return synergy;
    }

    public void setSynergy(String synergy) {
        this.synergy = synergy;
    }

    @Basic
    @Column(name = "epic_use")
    public String getEpicUse() {
        return epicUse;
    }

    public void setEpicUse(String epicUse) {
        this.epicUse = epicUse;
    }

    @Basic
    @Column(name = "untrained")
    public String getUntrained() {
        return untrained;
    }

    public void setUntrained(String untrained) {
        this.untrained = untrained;
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

        SkillEntity that = (SkillEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (subEngine != null ? !subEngine.equals(that.subEngine) : that.subEngine != null) return false;
        if (keyAbility != null ? !keyAbility.equals(that.keyAbility) : that.keyAbility != null) return false;
        if (psionic != null ? !psionic.equals(that.psionic) : that.psionic != null) return false;
        if (trained != null ? !trained.equals(that.trained) : that.trained != null) return false;
        if (armorCheck != null ? !armorCheck.equals(that.armorCheck) : that.armorCheck != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (skillCheck != null ? !skillCheck.equals(that.skillCheck) : that.skillCheck != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (tryAgain != null ? !tryAgain.equals(that.tryAgain) : that.tryAgain != null) return false;
        if (special != null ? !special.equals(that.special) : that.special != null) return false;
        if (restriction != null ? !restriction.equals(that.restriction) : that.restriction != null) return false;
        if (synergy != null ? !synergy.equals(that.synergy) : that.synergy != null) return false;
        if (epicUse != null ? !epicUse.equals(that.epicUse) : that.epicUse != null) return false;
        if (untrained != null ? !untrained.equals(that.untrained) : that.untrained != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (subEngine != null ? subEngine.hashCode() : 0);
        result = 31 * result + (keyAbility != null ? keyAbility.hashCode() : 0);
        result = 31 * result + (psionic != null ? psionic.hashCode() : 0);
        result = 31 * result + (trained != null ? trained.hashCode() : 0);
        result = 31 * result + (armorCheck != null ? armorCheck.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (skillCheck != null ? skillCheck.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (tryAgain != null ? tryAgain.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        result = 31 * result + (restriction != null ? restriction.hashCode() : 0);
        result = 31 * result + (synergy != null ? synergy.hashCode() : 0);
        result = 31 * result + (epicUse != null ? epicUse.hashCode() : 0);
        result = 31 * result + (untrained != null ? untrained.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
