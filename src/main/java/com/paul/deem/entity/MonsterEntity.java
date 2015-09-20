package com.paul.deem.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "monster", schema = "", catalog = "3.5srd")
public class MonsterEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private String size;

    @Basic
    @javax.persistence.Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    private String descriptor;

    @Basic
    @javax.persistence.Column(name = "descriptor")
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    private String hitDice;

    @Basic
    @javax.persistence.Column(name = "hit_dice")
    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    private String initiative;

    @Basic
    @javax.persistence.Column(name = "initiative")
    public String getInitiative() {
        return initiative;
    }

    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }

    private String speed;

    @Basic
    @javax.persistence.Column(name = "speed")
    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    private String armorClass;

    @Basic
    @javax.persistence.Column(name = "armor_class")
    public String getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(String armorClass) {
        this.armorClass = armorClass;
    }

    private String baseAttack;

    @Basic
    @javax.persistence.Column(name = "base_attack")
    public String getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(String baseAttack) {
        this.baseAttack = baseAttack;
    }

    private String grapple;

    @Basic
    @javax.persistence.Column(name = "grapple")
    public String getGrapple() {
        return grapple;
    }

    public void setGrapple(String grapple) {
        this.grapple = grapple;
    }

    private String attack;

    @Basic
    @javax.persistence.Column(name = "attack")
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    private String fullAttack;

    @Basic
    @javax.persistence.Column(name = "full_attack")
    public String getFullAttack() {
        return fullAttack;
    }

    public void setFullAttack(String fullAttack) {
        this.fullAttack = fullAttack;
    }

    private String space;

    @Basic
    @javax.persistence.Column(name = "space")
    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    private String reach;

    @Basic
    @javax.persistence.Column(name = "reach")
    public String getReach() {
        return reach;
    }

    public void setReach(String reach) {
        this.reach = reach;
    }

    private String specialAttacks;

    @Basic
    @javax.persistence.Column(name = "special_attacks")
    public String getSpecialAttacks() {
        return specialAttacks;
    }

    public void setSpecialAttacks(String specialAttacks) {
        this.specialAttacks = specialAttacks;
    }

    private String specialQualities;

    @Basic
    @javax.persistence.Column(name = "special_qualities")
    public String getSpecialQualities() {
        return specialQualities;
    }

    public void setSpecialQualities(String specialQualities) {
        this.specialQualities = specialQualities;
    }

    private String saves;

    @Basic
    @javax.persistence.Column(name = "saves")
    public String getSaves() {
        return saves;
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    private String abilities;

    @Basic
    @javax.persistence.Column(name = "abilities")
    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    private String skills;

    @Basic
    @javax.persistence.Column(name = "skills")
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    private String bonusFeats;

    @Basic
    @javax.persistence.Column(name = "bonus_feats")
    public String getBonusFeats() {
        return bonusFeats;
    }

    public void setBonusFeats(String bonusFeats) {
        this.bonusFeats = bonusFeats;
    }

    private String feats;

    @Basic
    @javax.persistence.Column(name = "feats")
    public String getFeats() {
        return feats;
    }

    public void setFeats(String feats) {
        this.feats = feats;
    }

    private String epicFeats;

    @Basic
    @javax.persistence.Column(name = "epic_feats")
    public String getEpicFeats() {
        return epicFeats;
    }

    public void setEpicFeats(String epicFeats) {
        this.epicFeats = epicFeats;
    }

    private String environment;

    @Basic
    @javax.persistence.Column(name = "environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    private String organization;

    @Basic
    @javax.persistence.Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    private String challengeRating;

    @Basic
    @javax.persistence.Column(name = "challenge_rating")
    public String getChallengeRating() {
        return challengeRating;
    }

    public void setChallengeRating(String challengeRating) {
        this.challengeRating = challengeRating;
    }

    private String treasure;

    @Basic
    @javax.persistence.Column(name = "treasure")
    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
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

    private String advancement;

    @Basic
    @javax.persistence.Column(name = "advancement")
    public String getAdvancement() {
        return advancement;
    }

    public void setAdvancement(String advancement) {
        this.advancement = advancement;
    }

    private String levelAdjustment;

    @Basic
    @javax.persistence.Column(name = "level_adjustment")
    public String getLevelAdjustment() {
        return levelAdjustment;
    }

    public void setLevelAdjustment(String levelAdjustment) {
        this.levelAdjustment = levelAdjustment;
    }

    private String specialAbilities;

    @Basic
    @javax.persistence.Column(name = "special_abilities")
    public String getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(String specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    private String statBlock;

    @Basic
    @javax.persistence.Column(name = "stat_block")
    public String getStatBlock() {
        return statBlock;
    }

    public void setStatBlock(String statBlock) {
        this.statBlock = statBlock;
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

        MonsterEntity that = (MonsterEntity) o;

        if (id != that.id) return false;
        if (family != null ? !family.equals(that.family) : that.family != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (altname != null ? !altname.equals(that.altname) : that.altname != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (descriptor != null ? !descriptor.equals(that.descriptor) : that.descriptor != null) return false;
        if (hitDice != null ? !hitDice.equals(that.hitDice) : that.hitDice != null) return false;
        if (initiative != null ? !initiative.equals(that.initiative) : that.initiative != null) return false;
        if (speed != null ? !speed.equals(that.speed) : that.speed != null) return false;
        if (armorClass != null ? !armorClass.equals(that.armorClass) : that.armorClass != null) return false;
        if (baseAttack != null ? !baseAttack.equals(that.baseAttack) : that.baseAttack != null) return false;
        if (grapple != null ? !grapple.equals(that.grapple) : that.grapple != null) return false;
        if (attack != null ? !attack.equals(that.attack) : that.attack != null) return false;
        if (fullAttack != null ? !fullAttack.equals(that.fullAttack) : that.fullAttack != null) return false;
        if (space != null ? !space.equals(that.space) : that.space != null) return false;
        if (reach != null ? !reach.equals(that.reach) : that.reach != null) return false;
        if (specialAttacks != null ? !specialAttacks.equals(that.specialAttacks) : that.specialAttacks != null)
            return false;
        if (specialQualities != null ? !specialQualities.equals(that.specialQualities) : that.specialQualities != null)
            return false;
        if (saves != null ? !saves.equals(that.saves) : that.saves != null) return false;
        if (abilities != null ? !abilities.equals(that.abilities) : that.abilities != null) return false;
        if (skills != null ? !skills.equals(that.skills) : that.skills != null) return false;
        if (bonusFeats != null ? !bonusFeats.equals(that.bonusFeats) : that.bonusFeats != null) return false;
        if (feats != null ? !feats.equals(that.feats) : that.feats != null) return false;
        if (epicFeats != null ? !epicFeats.equals(that.epicFeats) : that.epicFeats != null) return false;
        if (environment != null ? !environment.equals(that.environment) : that.environment != null) return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (challengeRating != null ? !challengeRating.equals(that.challengeRating) : that.challengeRating != null)
            return false;
        if (treasure != null ? !treasure.equals(that.treasure) : that.treasure != null) return false;
        if (alignment != null ? !alignment.equals(that.alignment) : that.alignment != null) return false;
        if (advancement != null ? !advancement.equals(that.advancement) : that.advancement != null) return false;
        if (levelAdjustment != null ? !levelAdjustment.equals(that.levelAdjustment) : that.levelAdjustment != null)
            return false;
        if (specialAbilities != null ? !specialAbilities.equals(that.specialAbilities) : that.specialAbilities != null)
            return false;
        if (statBlock != null ? !statBlock.equals(that.statBlock) : that.statBlock != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (altname != null ? altname.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (descriptor != null ? descriptor.hashCode() : 0);
        result = 31 * result + (hitDice != null ? hitDice.hashCode() : 0);
        result = 31 * result + (initiative != null ? initiative.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (armorClass != null ? armorClass.hashCode() : 0);
        result = 31 * result + (baseAttack != null ? baseAttack.hashCode() : 0);
        result = 31 * result + (grapple != null ? grapple.hashCode() : 0);
        result = 31 * result + (attack != null ? attack.hashCode() : 0);
        result = 31 * result + (fullAttack != null ? fullAttack.hashCode() : 0);
        result = 31 * result + (space != null ? space.hashCode() : 0);
        result = 31 * result + (reach != null ? reach.hashCode() : 0);
        result = 31 * result + (specialAttacks != null ? specialAttacks.hashCode() : 0);
        result = 31 * result + (specialQualities != null ? specialQualities.hashCode() : 0);
        result = 31 * result + (saves != null ? saves.hashCode() : 0);
        result = 31 * result + (abilities != null ? abilities.hashCode() : 0);
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + (bonusFeats != null ? bonusFeats.hashCode() : 0);
        result = 31 * result + (feats != null ? feats.hashCode() : 0);
        result = 31 * result + (epicFeats != null ? epicFeats.hashCode() : 0);
        result = 31 * result + (environment != null ? environment.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (challengeRating != null ? challengeRating.hashCode() : 0);
        result = 31 * result + (treasure != null ? treasure.hashCode() : 0);
        result = 31 * result + (alignment != null ? alignment.hashCode() : 0);
        result = 31 * result + (advancement != null ? advancement.hashCode() : 0);
        result = 31 * result + (levelAdjustment != null ? levelAdjustment.hashCode() : 0);
        result = 31 * result + (specialAbilities != null ? specialAbilities.hashCode() : 0);
        result = 31 * result + (statBlock != null ? statBlock.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
