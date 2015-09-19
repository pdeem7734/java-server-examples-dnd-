package com.paul.deem.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "class", schema = "", catalog = "3.5srd")
public class ClazzEntity {
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

    private String engine;

    @Basic
    @javax.persistence.Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String alignment;

    @Basic
    @javax.persistence.Column(name = "alignment")
    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    private String hitDie;

    @Basic
    @javax.persistence.Column(name = "hit_die")
    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    private String classSkills;

    @Basic
    @javax.persistence.Column(name = "class_skills")
    public String getClassSkills() {
        return classSkills;
    }

    public void setClassSkills(String classSkills) {
        this.classSkills = classSkills;
    }

    private String skillPoints;

    @Basic
    @javax.persistence.Column(name = "skill_points")
    public String getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(String skillPoints) {
        this.skillPoints = skillPoints;
    }

    private String skillPointsAbility;

    @Basic
    @javax.persistence.Column(name = "skill_points_ability")
    public String getSkillPointsAbility() {
        return skillPointsAbility;
    }

    public void setSkillPointsAbility(String skillPointsAbility) {
        this.skillPointsAbility = skillPointsAbility;
    }

    private String spellStat;

    @Basic
    @javax.persistence.Column(name = "spell_stat")
    public String getSpellStat() {
        return spellStat;
    }

    public void setSpellStat(String spellStat) {
        this.spellStat = spellStat;
    }

    private String proficiencies;

    @Basic
    @javax.persistence.Column(name = "proficiencies")
    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    private String spellEngine;

    @Basic
    @javax.persistence.Column(name = "spell_ENGINE")
    public String getSpellEngine() {
        return spellEngine;
    }

    public void setSpellEngine(String spellEngine) {
        this.spellEngine = spellEngine;
    }

    private String epicFeatBaseLevel;

    @Basic
    @javax.persistence.Column(name = "epic_feat_base_level")
    public String getEpicFeatBaseLevel() {
        return epicFeatBaseLevel;
    }

    public void setEpicFeatBaseLevel(String epicFeatBaseLevel) {
        this.epicFeatBaseLevel = epicFeatBaseLevel;
    }

    private String epicFeatInterval;

    @Basic
    @javax.persistence.Column(name = "epic_feat_interval")
    public String getEpicFeatInterval() {
        return epicFeatInterval;
    }

    public void setEpicFeatInterval(String epicFeatInterval) {
        this.epicFeatInterval = epicFeatInterval;
    }

    private String epicFeatList;

    @Basic
    @javax.persistence.Column(name = "epic_feat_list")
    public String getEpicFeatList() {
        return epicFeatList;
    }

    public void setEpicFeatList(String epicFeatList) {
        this.epicFeatList = epicFeatList;
    }

    private String epicFullText;

    @Basic
    @javax.persistence.Column(name = "epic_full_text")
    public String getEpicFullText() {
        return epicFullText;
    }

    public void setEpicFullText(String epicFullText) {
        this.epicFullText = epicFullText;
    }

    private String reqRace;

    @Basic
    @javax.persistence.Column(name = "req_race")
    public String getReqRace() {
        return reqRace;
    }

    public void setReqRace(String reqRace) {
        this.reqRace = reqRace;
    }

    private String reqWeaponProficiency;

    @Basic
    @javax.persistence.Column(name = "req_weapon_proficiency")
    public String getReqWeaponProficiency() {
        return reqWeaponProficiency;
    }

    public void setReqWeaponProficiency(String reqWeaponProficiency) {
        this.reqWeaponProficiency = reqWeaponProficiency;
    }

    private String reqBaseAttackBonus;

    @Basic
    @javax.persistence.Column(name = "req_base_attack_bonus")
    public String getReqBaseAttackBonus() {
        return reqBaseAttackBonus;
    }

    public void setReqBaseAttackBonus(String reqBaseAttackBonus) {
        this.reqBaseAttackBonus = reqBaseAttackBonus;
    }

    private String reqSkill;

    @Basic
    @javax.persistence.Column(name = "req_skill")
    public String getReqSkill() {
        return reqSkill;
    }

    public void setReqSkill(String reqSkill) {
        this.reqSkill = reqSkill;
    }

    private String reqFeat;

    @Basic
    @javax.persistence.Column(name = "req_feat")
    public String getReqFeat() {
        return reqFeat;
    }

    public void setReqFeat(String reqFeat) {
        this.reqFeat = reqFeat;
    }

    private String reqSpells;

    @Basic
    @javax.persistence.Column(name = "req_spells")
    public String getReqSpells() {
        return reqSpells;
    }

    public void setReqSpells(String reqSpells) {
        this.reqSpells = reqSpells;
    }

    private String reqLanguages;

    @Basic
    @javax.persistence.Column(name = "req_languages")
    public String getReqLanguages() {
        return reqLanguages;
    }

    public void setReqLanguages(String reqLanguages) {
        this.reqLanguages = reqLanguages;
    }

    private String reqPsionics;

    @Basic
    @javax.persistence.Column(name = "req_psionics")
    public String getReqPsionics() {
        return reqPsionics;
    }

    public void setReqPsionics(String reqPsionics) {
        this.reqPsionics = reqPsionics;
    }

    private String reqEpicFeat;

    @Basic
    @javax.persistence.Column(name = "req_epic_feat")
    public String getReqEpicFeat() {
        return reqEpicFeat;
    }

    public void setReqEpicFeat(String reqEpicFeat) {
        this.reqEpicFeat = reqEpicFeat;
    }

    private String reqSpecial;

    @Basic
    @javax.persistence.Column(name = "req_special")
    public String getReqSpecial() {
        return reqSpecial;
    }

    public void setReqSpecial(String reqSpecial) {
        this.reqSpecial = reqSpecial;
    }

    private String spellList1;

    @Basic
    @javax.persistence.Column(name = "spell_list_1")
    public String getSpellList1() {
        return spellList1;
    }

    public void setSpellList1(String spellList1) {
        this.spellList1 = spellList1;
    }

    private String spellList2;

    @Basic
    @javax.persistence.Column(name = "spell_list_2")
    public String getSpellList2() {
        return spellList2;
    }

    public void setSpellList2(String spellList2) {
        this.spellList2 = spellList2;
    }

    private String spellList3;

    @Basic
    @javax.persistence.Column(name = "spell_list_3")
    public String getSpellList3() {
        return spellList3;
    }

    public void setSpellList3(String spellList3) {
        this.spellList3 = spellList3;
    }

    private String spellList4;

    @Basic
    @javax.persistence.Column(name = "spell_list_4")
    public String getSpellList4() {
        return spellList4;
    }

    public void setSpellList4(String spellList4) {
        this.spellList4 = spellList4;
    }

    private String spellList5;

    @Basic
    @javax.persistence.Column(name = "spell_list_5")
    public String getSpellList5() {
        return spellList5;
    }

    public void setSpellList5(String spellList5) {
        this.spellList5 = spellList5;
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

        ClazzEntity that = (ClazzEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (alignment != null ? !alignment.equals(that.alignment) : that.alignment != null) return false;
        if (hitDie != null ? !hitDie.equals(that.hitDie) : that.hitDie != null) return false;
        if (classSkills != null ? !classSkills.equals(that.classSkills) : that.classSkills != null) return false;
        if (skillPoints != null ? !skillPoints.equals(that.skillPoints) : that.skillPoints != null) return false;
        if (skillPointsAbility != null ? !skillPointsAbility.equals(that.skillPointsAbility) : that.skillPointsAbility != null)
            return false;
        if (spellStat != null ? !spellStat.equals(that.spellStat) : that.spellStat != null) return false;
        if (proficiencies != null ? !proficiencies.equals(that.proficiencies) : that.proficiencies != null)
            return false;
        if (spellEngine != null ? !spellEngine.equals(that.spellEngine) : that.spellEngine != null) return false;
        if (epicFeatBaseLevel != null ? !epicFeatBaseLevel.equals(that.epicFeatBaseLevel) : that.epicFeatBaseLevel != null)
            return false;
        if (epicFeatInterval != null ? !epicFeatInterval.equals(that.epicFeatInterval) : that.epicFeatInterval != null)
            return false;
        if (epicFeatList != null ? !epicFeatList.equals(that.epicFeatList) : that.epicFeatList != null) return false;
        if (epicFullText != null ? !epicFullText.equals(that.epicFullText) : that.epicFullText != null) return false;
        if (reqRace != null ? !reqRace.equals(that.reqRace) : that.reqRace != null) return false;
        if (reqWeaponProficiency != null ? !reqWeaponProficiency.equals(that.reqWeaponProficiency) : that.reqWeaponProficiency != null)
            return false;
        if (reqBaseAttackBonus != null ? !reqBaseAttackBonus.equals(that.reqBaseAttackBonus) : that.reqBaseAttackBonus != null)
            return false;
        if (reqSkill != null ? !reqSkill.equals(that.reqSkill) : that.reqSkill != null) return false;
        if (reqFeat != null ? !reqFeat.equals(that.reqFeat) : that.reqFeat != null) return false;
        if (reqSpells != null ? !reqSpells.equals(that.reqSpells) : that.reqSpells != null) return false;
        if (reqLanguages != null ? !reqLanguages.equals(that.reqLanguages) : that.reqLanguages != null) return false;
        if (reqPsionics != null ? !reqPsionics.equals(that.reqPsionics) : that.reqPsionics != null) return false;
        if (reqEpicFeat != null ? !reqEpicFeat.equals(that.reqEpicFeat) : that.reqEpicFeat != null) return false;
        if (reqSpecial != null ? !reqSpecial.equals(that.reqSpecial) : that.reqSpecial != null) return false;
        if (spellList1 != null ? !spellList1.equals(that.spellList1) : that.spellList1 != null) return false;
        if (spellList2 != null ? !spellList2.equals(that.spellList2) : that.spellList2 != null) return false;
        if (spellList3 != null ? !spellList3.equals(that.spellList3) : that.spellList3 != null) return false;
        if (spellList4 != null ? !spellList4.equals(that.spellList4) : that.spellList4 != null) return false;
        if (spellList5 != null ? !spellList5.equals(that.spellList5) : that.spellList5 != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (alignment != null ? alignment.hashCode() : 0);
        result = 31 * result + (hitDie != null ? hitDie.hashCode() : 0);
        result = 31 * result + (classSkills != null ? classSkills.hashCode() : 0);
        result = 31 * result + (skillPoints != null ? skillPoints.hashCode() : 0);
        result = 31 * result + (skillPointsAbility != null ? skillPointsAbility.hashCode() : 0);
        result = 31 * result + (spellStat != null ? spellStat.hashCode() : 0);
        result = 31 * result + (proficiencies != null ? proficiencies.hashCode() : 0);
        result = 31 * result + (spellEngine != null ? spellEngine.hashCode() : 0);
        result = 31 * result + (epicFeatBaseLevel != null ? epicFeatBaseLevel.hashCode() : 0);
        result = 31 * result + (epicFeatInterval != null ? epicFeatInterval.hashCode() : 0);
        result = 31 * result + (epicFeatList != null ? epicFeatList.hashCode() : 0);
        result = 31 * result + (epicFullText != null ? epicFullText.hashCode() : 0);
        result = 31 * result + (reqRace != null ? reqRace.hashCode() : 0);
        result = 31 * result + (reqWeaponProficiency != null ? reqWeaponProficiency.hashCode() : 0);
        result = 31 * result + (reqBaseAttackBonus != null ? reqBaseAttackBonus.hashCode() : 0);
        result = 31 * result + (reqSkill != null ? reqSkill.hashCode() : 0);
        result = 31 * result + (reqFeat != null ? reqFeat.hashCode() : 0);
        result = 31 * result + (reqSpells != null ? reqSpells.hashCode() : 0);
        result = 31 * result + (reqLanguages != null ? reqLanguages.hashCode() : 0);
        result = 31 * result + (reqPsionics != null ? reqPsionics.hashCode() : 0);
        result = 31 * result + (reqEpicFeat != null ? reqEpicFeat.hashCode() : 0);
        result = 31 * result + (reqSpecial != null ? reqSpecial.hashCode() : 0);
        result = 31 * result + (spellList1 != null ? spellList1.hashCode() : 0);
        result = 31 * result + (spellList2 != null ? spellList2.hashCode() : 0);
        result = 31 * result + (spellList3 != null ? spellList3.hashCode() : 0);
        result = 31 * result + (spellList4 != null ? spellList4.hashCode() : 0);
        result = 31 * result + (spellList5 != null ? spellList5.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
