package com.paul.deem.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "class_table", schema = "", catalog = "3.5srd")
public class ClassTableEntity {
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

    private String level;

    @Basic
    @javax.persistence.Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String baseAttackBonus;

    @Basic
    @javax.persistence.Column(name = "base_attack_bonus")
    public String getBaseAttackBonus() {
        return baseAttackBonus;
    }

    public void setBaseAttackBonus(String baseAttackBonus) {
        this.baseAttackBonus = baseAttackBonus;
    }

    private String fortSave;

    @Basic
    @javax.persistence.Column(name = "fort_save")
    public String getFortSave() {
        return fortSave;
    }

    public void setFortSave(String fortSave) {
        this.fortSave = fortSave;
    }

    private String refSave;

    @Basic
    @javax.persistence.Column(name = "ref_save")
    public String getRefSave() {
        return refSave;
    }

    public void setRefSave(String refSave) {
        this.refSave = refSave;
    }

    private String willSave;

    @Basic
    @javax.persistence.Column(name = "will_save")
    public String getWillSave() {
        return willSave;
    }

    public void setWillSave(String willSave) {
        this.willSave = willSave;
    }

    private String casterLevel;

    @Basic
    @javax.persistence.Column(name = "caster_level")
    public String getCasterLevel() {
        return casterLevel;
    }

    public void setCasterLevel(String casterLevel) {
        this.casterLevel = casterLevel;
    }

    private String pointsPerDay;

    @Basic
    @javax.persistence.Column(name = "points_per_day")
    public String getPointsPerDay() {
        return pointsPerDay;
    }

    public void setPointsPerDay(String pointsPerDay) {
        this.pointsPerDay = pointsPerDay;
    }

    private String acBonus;

    @Basic
    @javax.persistence.Column(name = "ac_bonus")
    public String getAcBonus() {
        return acBonus;
    }

    public void setAcBonus(String acBonus) {
        this.acBonus = acBonus;
    }

    private String flurryOfBlows;

    @Basic
    @javax.persistence.Column(name = "flurry_of_blows")
    public String getFlurryOfBlows() {
        return flurryOfBlows;
    }

    public void setFlurryOfBlows(String flurryOfBlows) {
        this.flurryOfBlows = flurryOfBlows;
    }

    private String bonusSpells;

    @Basic
    @javax.persistence.Column(name = "bonus_spells")
    public String getBonusSpells() {
        return bonusSpells;
    }

    public void setBonusSpells(String bonusSpells) {
        this.bonusSpells = bonusSpells;
    }

    private String powersKnown;

    @Basic
    @javax.persistence.Column(name = "powers_known")
    public String getPowersKnown() {
        return powersKnown;
    }

    public void setPowersKnown(String powersKnown) {
        this.powersKnown = powersKnown;
    }

    private String unarmoredSpeedBonus;

    @Basic
    @javax.persistence.Column(name = "unarmored_speed_bonus")
    public String getUnarmoredSpeedBonus() {
        return unarmoredSpeedBonus;
    }

    public void setUnarmoredSpeedBonus(String unarmoredSpeedBonus) {
        this.unarmoredSpeedBonus = unarmoredSpeedBonus;
    }

    private String unarmedDamage;

    @Basic
    @javax.persistence.Column(name = "unarmed_damage")
    public String getUnarmedDamage() {
        return unarmedDamage;
    }

    public void setUnarmedDamage(String unarmedDamage) {
        this.unarmedDamage = unarmedDamage;
    }

    private String powerLevel;

    @Basic
    @javax.persistence.Column(name = "power_level")
    public String getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(String powerLevel) {
        this.powerLevel = powerLevel;
    }

    private String special;

    @Basic
    @javax.persistence.Column(name = "special")
    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    private String slots0;

    @Basic
    @javax.persistence.Column(name = "slots_0")
    public String getSlots0() {
        return slots0;
    }

    public void setSlots0(String slots0) {
        this.slots0 = slots0;
    }

    private String slots1;

    @Basic
    @javax.persistence.Column(name = "slots_1")
    public String getSlots1() {
        return slots1;
    }

    public void setSlots1(String slots1) {
        this.slots1 = slots1;
    }

    private String slots2;

    @Basic
    @javax.persistence.Column(name = "slots_2")
    public String getSlots2() {
        return slots2;
    }

    public void setSlots2(String slots2) {
        this.slots2 = slots2;
    }

    private String slots3;

    @Basic
    @javax.persistence.Column(name = "slots_3")
    public String getSlots3() {
        return slots3;
    }

    public void setSlots3(String slots3) {
        this.slots3 = slots3;
    }

    private String slots4;

    @Basic
    @javax.persistence.Column(name = "slots_4")
    public String getSlots4() {
        return slots4;
    }

    public void setSlots4(String slots4) {
        this.slots4 = slots4;
    }

    private String slots5;

    @Basic
    @javax.persistence.Column(name = "slots_5")
    public String getSlots5() {
        return slots5;
    }

    public void setSlots5(String slots5) {
        this.slots5 = slots5;
    }

    private String slots6;

    @Basic
    @javax.persistence.Column(name = "slots_6")
    public String getSlots6() {
        return slots6;
    }

    public void setSlots6(String slots6) {
        this.slots6 = slots6;
    }

    private String slots7;

    @Basic
    @javax.persistence.Column(name = "slots_7")
    public String getSlots7() {
        return slots7;
    }

    public void setSlots7(String slots7) {
        this.slots7 = slots7;
    }

    private String slots8;

    @Basic
    @javax.persistence.Column(name = "slots_8")
    public String getSlots8() {
        return slots8;
    }

    public void setSlots8(String slots8) {
        this.slots8 = slots8;
    }

    private String slots9;

    @Basic
    @javax.persistence.Column(name = "slots_9")
    public String getSlots9() {
        return slots9;
    }

    public void setSlots9(String slots9) {
        this.slots9 = slots9;
    }

    private String spellsKnown0;

    @Basic
    @javax.persistence.Column(name = "spells_known_0")
    public String getSpellsKnown0() {
        return spellsKnown0;
    }

    public void setSpellsKnown0(String spellsKnown0) {
        this.spellsKnown0 = spellsKnown0;
    }

    private String spellsKnown1;

    @Basic
    @javax.persistence.Column(name = "spells_known_1")
    public String getSpellsKnown1() {
        return spellsKnown1;
    }

    public void setSpellsKnown1(String spellsKnown1) {
        this.spellsKnown1 = spellsKnown1;
    }

    private String spellsKnown2;

    @Basic
    @javax.persistence.Column(name = "spells_known_2")
    public String getSpellsKnown2() {
        return spellsKnown2;
    }

    public void setSpellsKnown2(String spellsKnown2) {
        this.spellsKnown2 = spellsKnown2;
    }

    private String spellsKnown3;

    @Basic
    @javax.persistence.Column(name = "spells_known_3")
    public String getSpellsKnown3() {
        return spellsKnown3;
    }

    public void setSpellsKnown3(String spellsKnown3) {
        this.spellsKnown3 = spellsKnown3;
    }

    private String spellsKnown4;

    @Basic
    @javax.persistence.Column(name = "spells_known_4")
    public String getSpellsKnown4() {
        return spellsKnown4;
    }

    public void setSpellsKnown4(String spellsKnown4) {
        this.spellsKnown4 = spellsKnown4;
    }

    private String spellsKnown5;

    @Basic
    @javax.persistence.Column(name = "spells_known_5")
    public String getSpellsKnown5() {
        return spellsKnown5;
    }

    public void setSpellsKnown5(String spellsKnown5) {
        this.spellsKnown5 = spellsKnown5;
    }

    private String spellsKnown6;

    @Basic
    @javax.persistence.Column(name = "spells_known_6")
    public String getSpellsKnown6() {
        return spellsKnown6;
    }

    public void setSpellsKnown6(String spellsKnown6) {
        this.spellsKnown6 = spellsKnown6;
    }

    private String spellsKnown7;

    @Basic
    @javax.persistence.Column(name = "spells_known_7")
    public String getSpellsKnown7() {
        return spellsKnown7;
    }

    public void setSpellsKnown7(String spellsKnown7) {
        this.spellsKnown7 = spellsKnown7;
    }

    private String spellsKnown8;

    @Basic
    @javax.persistence.Column(name = "spells_known_8")
    public String getSpellsKnown8() {
        return spellsKnown8;
    }

    public void setSpellsKnown8(String spellsKnown8) {
        this.spellsKnown8 = spellsKnown8;
    }

    private String spellsKnown9;

    @Basic
    @javax.persistence.Column(name = "spells_known_9")
    public String getSpellsKnown9() {
        return spellsKnown9;
    }

    public void setSpellsKnown9(String spellsKnown9) {
        this.spellsKnown9 = spellsKnown9;
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

        ClassTableEntity that = (ClassTableEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (baseAttackBonus != null ? !baseAttackBonus.equals(that.baseAttackBonus) : that.baseAttackBonus != null)
            return false;
        if (fortSave != null ? !fortSave.equals(that.fortSave) : that.fortSave != null) return false;
        if (refSave != null ? !refSave.equals(that.refSave) : that.refSave != null) return false;
        if (willSave != null ? !willSave.equals(that.willSave) : that.willSave != null) return false;
        if (casterLevel != null ? !casterLevel.equals(that.casterLevel) : that.casterLevel != null) return false;
        if (pointsPerDay != null ? !pointsPerDay.equals(that.pointsPerDay) : that.pointsPerDay != null) return false;
        if (acBonus != null ? !acBonus.equals(that.acBonus) : that.acBonus != null) return false;
        if (flurryOfBlows != null ? !flurryOfBlows.equals(that.flurryOfBlows) : that.flurryOfBlows != null)
            return false;
        if (bonusSpells != null ? !bonusSpells.equals(that.bonusSpells) : that.bonusSpells != null) return false;
        if (powersKnown != null ? !powersKnown.equals(that.powersKnown) : that.powersKnown != null) return false;
        if (unarmoredSpeedBonus != null ? !unarmoredSpeedBonus.equals(that.unarmoredSpeedBonus) : that.unarmoredSpeedBonus != null)
            return false;
        if (unarmedDamage != null ? !unarmedDamage.equals(that.unarmedDamage) : that.unarmedDamage != null)
            return false;
        if (powerLevel != null ? !powerLevel.equals(that.powerLevel) : that.powerLevel != null) return false;
        if (special != null ? !special.equals(that.special) : that.special != null) return false;
        if (slots0 != null ? !slots0.equals(that.slots0) : that.slots0 != null) return false;
        if (slots1 != null ? !slots1.equals(that.slots1) : that.slots1 != null) return false;
        if (slots2 != null ? !slots2.equals(that.slots2) : that.slots2 != null) return false;
        if (slots3 != null ? !slots3.equals(that.slots3) : that.slots3 != null) return false;
        if (slots4 != null ? !slots4.equals(that.slots4) : that.slots4 != null) return false;
        if (slots5 != null ? !slots5.equals(that.slots5) : that.slots5 != null) return false;
        if (slots6 != null ? !slots6.equals(that.slots6) : that.slots6 != null) return false;
        if (slots7 != null ? !slots7.equals(that.slots7) : that.slots7 != null) return false;
        if (slots8 != null ? !slots8.equals(that.slots8) : that.slots8 != null) return false;
        if (slots9 != null ? !slots9.equals(that.slots9) : that.slots9 != null) return false;
        if (spellsKnown0 != null ? !spellsKnown0.equals(that.spellsKnown0) : that.spellsKnown0 != null) return false;
        if (spellsKnown1 != null ? !spellsKnown1.equals(that.spellsKnown1) : that.spellsKnown1 != null) return false;
        if (spellsKnown2 != null ? !spellsKnown2.equals(that.spellsKnown2) : that.spellsKnown2 != null) return false;
        if (spellsKnown3 != null ? !spellsKnown3.equals(that.spellsKnown3) : that.spellsKnown3 != null) return false;
        if (spellsKnown4 != null ? !spellsKnown4.equals(that.spellsKnown4) : that.spellsKnown4 != null) return false;
        if (spellsKnown5 != null ? !spellsKnown5.equals(that.spellsKnown5) : that.spellsKnown5 != null) return false;
        if (spellsKnown6 != null ? !spellsKnown6.equals(that.spellsKnown6) : that.spellsKnown6 != null) return false;
        if (spellsKnown7 != null ? !spellsKnown7.equals(that.spellsKnown7) : that.spellsKnown7 != null) return false;
        if (spellsKnown8 != null ? !spellsKnown8.equals(that.spellsKnown8) : that.spellsKnown8 != null) return false;
        if (spellsKnown9 != null ? !spellsKnown9.equals(that.spellsKnown9) : that.spellsKnown9 != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (baseAttackBonus != null ? baseAttackBonus.hashCode() : 0);
        result = 31 * result + (fortSave != null ? fortSave.hashCode() : 0);
        result = 31 * result + (refSave != null ? refSave.hashCode() : 0);
        result = 31 * result + (willSave != null ? willSave.hashCode() : 0);
        result = 31 * result + (casterLevel != null ? casterLevel.hashCode() : 0);
        result = 31 * result + (pointsPerDay != null ? pointsPerDay.hashCode() : 0);
        result = 31 * result + (acBonus != null ? acBonus.hashCode() : 0);
        result = 31 * result + (flurryOfBlows != null ? flurryOfBlows.hashCode() : 0);
        result = 31 * result + (bonusSpells != null ? bonusSpells.hashCode() : 0);
        result = 31 * result + (powersKnown != null ? powersKnown.hashCode() : 0);
        result = 31 * result + (unarmoredSpeedBonus != null ? unarmoredSpeedBonus.hashCode() : 0);
        result = 31 * result + (unarmedDamage != null ? unarmedDamage.hashCode() : 0);
        result = 31 * result + (powerLevel != null ? powerLevel.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        result = 31 * result + (slots0 != null ? slots0.hashCode() : 0);
        result = 31 * result + (slots1 != null ? slots1.hashCode() : 0);
        result = 31 * result + (slots2 != null ? slots2.hashCode() : 0);
        result = 31 * result + (slots3 != null ? slots3.hashCode() : 0);
        result = 31 * result + (slots4 != null ? slots4.hashCode() : 0);
        result = 31 * result + (slots5 != null ? slots5.hashCode() : 0);
        result = 31 * result + (slots6 != null ? slots6.hashCode() : 0);
        result = 31 * result + (slots7 != null ? slots7.hashCode() : 0);
        result = 31 * result + (slots8 != null ? slots8.hashCode() : 0);
        result = 31 * result + (slots9 != null ? slots9.hashCode() : 0);
        result = 31 * result + (spellsKnown0 != null ? spellsKnown0.hashCode() : 0);
        result = 31 * result + (spellsKnown1 != null ? spellsKnown1.hashCode() : 0);
        result = 31 * result + (spellsKnown2 != null ? spellsKnown2.hashCode() : 0);
        result = 31 * result + (spellsKnown3 != null ? spellsKnown3.hashCode() : 0);
        result = 31 * result + (spellsKnown4 != null ? spellsKnown4.hashCode() : 0);
        result = 31 * result + (spellsKnown5 != null ? spellsKnown5.hashCode() : 0);
        result = 31 * result + (spellsKnown6 != null ? spellsKnown6.hashCode() : 0);
        result = 31 * result + (spellsKnown7 != null ? spellsKnown7.hashCode() : 0);
        result = 31 * result + (spellsKnown8 != null ? spellsKnown8.hashCode() : 0);
        result = 31 * result + (spellsKnown9 != null ? spellsKnown9.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
