package com.paul.deem.model;

import javax.persistence.*;

@Entity
@Table(name = "domain", schema = "", catalog = "3.5srd")
public class DomainEntity {
    private int id;
    private String name;
    private String grantedPowers;
    private String spell1;
    private String spell2;
    private String spell3;
    private String spell4;
    private String spell5;
    private String spell6;
    private String spell7;
    private String spell8;
    private String spell9;
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
    @Column(name = "granted_powers")
    public String getGrantedPowers() {
        return grantedPowers;
    }

    public void setGrantedPowers(String grantedPowers) {
        this.grantedPowers = grantedPowers;
    }

    @Basic
    @Column(name = "spell_1")
    public String getSpell1() {
        return spell1;
    }

    public void setSpell1(String spell1) {
        this.spell1 = spell1;
    }

    @Basic
    @Column(name = "spell_2")
    public String getSpell2() {
        return spell2;
    }

    public void setSpell2(String spell2) {
        this.spell2 = spell2;
    }

    @Basic
    @Column(name = "spell_3")
    public String getSpell3() {
        return spell3;
    }

    public void setSpell3(String spell3) {
        this.spell3 = spell3;
    }

    @Basic
    @Column(name = "spell_4")
    public String getSpell4() {
        return spell4;
    }

    public void setSpell4(String spell4) {
        this.spell4 = spell4;
    }

    @Basic
    @Column(name = "spell_5")
    public String getSpell5() {
        return spell5;
    }

    public void setSpell5(String spell5) {
        this.spell5 = spell5;
    }

    @Basic
    @Column(name = "spell_6")
    public String getSpell6() {
        return spell6;
    }

    public void setSpell6(String spell6) {
        this.spell6 = spell6;
    }

    @Basic
    @Column(name = "spell_7")
    public String getSpell7() {
        return spell7;
    }

    public void setSpell7(String spell7) {
        this.spell7 = spell7;
    }

    @Basic
    @Column(name = "spell_8")
    public String getSpell8() {
        return spell8;
    }

    public void setSpell8(String spell8) {
        this.spell8 = spell8;
    }

    @Basic
    @Column(name = "spell_9")
    public String getSpell9() {
        return spell9;
    }

    public void setSpell9(String spell9) {
        this.spell9 = spell9;
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

        DomainEntity that = (DomainEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (grantedPowers != null ? !grantedPowers.equals(that.grantedPowers) : that.grantedPowers != null)
            return false;
        if (spell1 != null ? !spell1.equals(that.spell1) : that.spell1 != null) return false;
        if (spell2 != null ? !spell2.equals(that.spell2) : that.spell2 != null) return false;
        if (spell3 != null ? !spell3.equals(that.spell3) : that.spell3 != null) return false;
        if (spell4 != null ? !spell4.equals(that.spell4) : that.spell4 != null) return false;
        if (spell5 != null ? !spell5.equals(that.spell5) : that.spell5 != null) return false;
        if (spell6 != null ? !spell6.equals(that.spell6) : that.spell6 != null) return false;
        if (spell7 != null ? !spell7.equals(that.spell7) : that.spell7 != null) return false;
        if (spell8 != null ? !spell8.equals(that.spell8) : that.spell8 != null) return false;
        if (spell9 != null ? !spell9.equals(that.spell9) : that.spell9 != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (grantedPowers != null ? grantedPowers.hashCode() : 0);
        result = 31 * result + (spell1 != null ? spell1.hashCode() : 0);
        result = 31 * result + (spell2 != null ? spell2.hashCode() : 0);
        result = 31 * result + (spell3 != null ? spell3.hashCode() : 0);
        result = 31 * result + (spell4 != null ? spell4.hashCode() : 0);
        result = 31 * result + (spell5 != null ? spell5.hashCode() : 0);
        result = 31 * result + (spell6 != null ? spell6.hashCode() : 0);
        result = 31 * result + (spell7 != null ? spell7.hashCode() : 0);
        result = 31 * result + (spell8 != null ? spell8.hashCode() : 0);
        result = 31 * result + (spell9 != null ? spell9.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        return result;
    }
}
