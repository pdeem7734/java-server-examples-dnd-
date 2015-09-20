package com.paul.deem.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "spell", schema = "", catalog = "3.5srd")
public class SpellEntity {
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

    private String altname;

    @Basic
    @javax.persistence.Column(name = "altname")
    public String getAltname() {
        return altname;
    }

    public void setAltname(String altname) {
        this.altname = altname;
    }

    private String school;

    @Basic
    @javax.persistence.Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private String subschool;

    @Basic
    @javax.persistence.Column(name = "subschool")
    public String getSubschool() {
        return subschool;
    }

    public void setSubschool(String subschool) {
        this.subschool = subschool;
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

    private String spellcraftDc;

    @Basic
    @javax.persistence.Column(name = "spellcraft_dc")
    public String getSpellcraftDc() {
        return spellcraftDc;
    }

    public void setSpellcraftDc(String spellcraftDc) {
        this.spellcraftDc = spellcraftDc;
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

    private String components;

    @Basic
    @javax.persistence.Column(name = "components")
    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    private String castingTime;

    @Basic
    @javax.persistence.Column(name = "casting_time")
    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    private String spellRange;

    @Basic
    @javax.persistence.Column(name = "spell_range")
    public String getSpellRange() {
        return spellRange;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
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

    private String spellResistance;

    @Basic
    @javax.persistence.Column(name = "spell_resistance")
    public String getSpellResistance() {
        return spellResistance;
    }

    public void setSpellResistance(String spellResistance) {
        this.spellResistance = spellResistance;
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

    private String toDevelop;

    @Basic
    @javax.persistence.Column(name = "to_develop")
    public String getToDevelop() {
        return toDevelop;
    }

    public void setToDevelop(String toDevelop) {
        this.toDevelop = toDevelop;
    }

    private String materialComponents;

    @Basic
    @javax.persistence.Column(name = "material_components")
    public String getMaterialComponents() {
        return materialComponents;
    }

    public void setMaterialComponents(String materialComponents) {
        this.materialComponents = materialComponents;
    }

    private String arcaneMaterialComponents;

    @Basic
    @javax.persistence.Column(name = "arcane_material_components")
    public String getArcaneMaterialComponents() {
        return arcaneMaterialComponents;
    }

    public void setArcaneMaterialComponents(String arcaneMaterialComponents) {
        this.arcaneMaterialComponents = arcaneMaterialComponents;
    }

    private String focus;

    @Basic
    @javax.persistence.Column(name = "focus")
    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
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

    private String xpCost;

    @Basic
    @javax.persistence.Column(name = "xp_cost")
    public String getXpCost() {
        return xpCost;
    }

    public void setXpCost(String xpCost) {
        this.xpCost = xpCost;
    }

    private String arcaneFocus;

    @Basic
    @javax.persistence.Column(name = "arcane_focus")
    public String getArcaneFocus() {
        return arcaneFocus;
    }

    public void setArcaneFocus(String arcaneFocus) {
        this.arcaneFocus = arcaneFocus;
    }

    private String wizardFocus;

    @Basic
    @javax.persistence.Column(name = "wizard_focus")
    public String getWizardFocus() {
        return wizardFocus;
    }

    public void setWizardFocus(String wizardFocus) {
        this.wizardFocus = wizardFocus;
    }

    private String verbalComponents;

    @Basic
    @javax.persistence.Column(name = "verbal_components")
    public String getVerbalComponents() {
        return verbalComponents;
    }

    public void setVerbalComponents(String verbalComponents) {
        this.verbalComponents = verbalComponents;
    }

    private String sorcererFocus;

    @Basic
    @javax.persistence.Column(name = "sorcerer_focus")
    public String getSorcererFocus() {
        return sorcererFocus;
    }

    public void setSorcererFocus(String sorcererFocus) {
        this.sorcererFocus = sorcererFocus;
    }

    private String bardFocus;

    @Basic
    @javax.persistence.Column(name = "bard_focus")
    public String getBardFocus() {
        return bardFocus;
    }

    public void setBardFocus(String bardFocus) {
        this.bardFocus = bardFocus;
    }

    private String clericFocus;

    @Basic
    @javax.persistence.Column(name = "cleric_focus")
    public String getClericFocus() {
        return clericFocus;
    }

    public void setClericFocus(String clericFocus) {
        this.clericFocus = clericFocus;
    }

    private String druidFocus;

    @Basic
    @javax.persistence.Column(name = "druid_focus")
    public String getDruidFocus() {
        return druidFocus;
    }

    public void setDruidFocus(String druidFocus) {
        this.druidFocus = druidFocus;
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

        SpellEntity that = (SpellEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (altname != null ? !altname.equals(that.altname) : that.altname != null) return false;
        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (subschool != null ? !subschool.equals(that.subschool) : that.subschool != null) return false;
        if (descriptor != null ? !descriptor.equals(that.descriptor) : that.descriptor != null) return false;
        if (spellcraftDc != null ? !spellcraftDc.equals(that.spellcraftDc) : that.spellcraftDc != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (components != null ? !components.equals(that.components) : that.components != null) return false;
        if (castingTime != null ? !castingTime.equals(that.castingTime) : that.castingTime != null) return false;
        if (spellRange != null ? !spellRange.equals(that.spellRange) : that.spellRange != null) return false;
        if (target != null ? !target.equals(that.target) : that.target != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (savingThrow != null ? !savingThrow.equals(that.savingThrow) : that.savingThrow != null) return false;
        if (spellResistance != null ? !spellResistance.equals(that.spellResistance) : that.spellResistance != null)
            return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (toDevelop != null ? !toDevelop.equals(that.toDevelop) : that.toDevelop != null) return false;
        if (materialComponents != null ? !materialComponents.equals(that.materialComponents) : that.materialComponents != null)
            return false;
        if (arcaneMaterialComponents != null ? !arcaneMaterialComponents.equals(that.arcaneMaterialComponents) : that.arcaneMaterialComponents != null)
            return false;
        if (focus != null ? !focus.equals(that.focus) : that.focus != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (xpCost != null ? !xpCost.equals(that.xpCost) : that.xpCost != null) return false;
        if (arcaneFocus != null ? !arcaneFocus.equals(that.arcaneFocus) : that.arcaneFocus != null) return false;
        if (wizardFocus != null ? !wizardFocus.equals(that.wizardFocus) : that.wizardFocus != null) return false;
        if (verbalComponents != null ? !verbalComponents.equals(that.verbalComponents) : that.verbalComponents != null)
            return false;
        if (sorcererFocus != null ? !sorcererFocus.equals(that.sorcererFocus) : that.sorcererFocus != null)
            return false;
        if (bardFocus != null ? !bardFocus.equals(that.bardFocus) : that.bardFocus != null) return false;
        if (clericFocus != null ? !clericFocus.equals(that.clericFocus) : that.clericFocus != null) return false;
        if (druidFocus != null ? !druidFocus.equals(that.druidFocus) : that.druidFocus != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (altname != null ? altname.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (subschool != null ? subschool.hashCode() : 0);
        result = 31 * result + (descriptor != null ? descriptor.hashCode() : 0);
        result = 31 * result + (spellcraftDc != null ? spellcraftDc.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (components != null ? components.hashCode() : 0);
        result = 31 * result + (castingTime != null ? castingTime.hashCode() : 0);
        result = 31 * result + (spellRange != null ? spellRange.hashCode() : 0);
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (effect != null ? effect.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (savingThrow != null ? savingThrow.hashCode() : 0);
        result = 31 * result + (spellResistance != null ? spellResistance.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (toDevelop != null ? toDevelop.hashCode() : 0);
        result = 31 * result + (materialComponents != null ? materialComponents.hashCode() : 0);
        result = 31 * result + (arcaneMaterialComponents != null ? arcaneMaterialComponents.hashCode() : 0);
        result = 31 * result + (focus != null ? focus.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (xpCost != null ? xpCost.hashCode() : 0);
        result = 31 * result + (arcaneFocus != null ? arcaneFocus.hashCode() : 0);
        result = 31 * result + (wizardFocus != null ? wizardFocus.hashCode() : 0);
        result = 31 * result + (verbalComponents != null ? verbalComponents.hashCode() : 0);
        result = 31 * result + (sorcererFocus != null ? sorcererFocus.hashCode() : 0);
        result = 31 * result + (bardFocus != null ? bardFocus.hashCode() : 0);
        result = 31 * result + (clericFocus != null ? clericFocus.hashCode() : 0);
        result = 31 * result + (druidFocus != null ? druidFocus.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
