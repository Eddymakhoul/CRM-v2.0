/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crm;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Eddy
 */
@Entity
@Table(name = "tbladherents", catalog = "adherent", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tbladherents.findAll", query = "SELECT t FROM Tbladherents t"),
    @NamedQuery(name = "Tbladherents.findByAdhId", query = "SELECT t FROM Tbladherents t WHERE t.adhId = :adhId"),
    @NamedQuery(name = "Tbladherents.findByAdhFirstName", query = "SELECT t FROM Tbladherents t WHERE t.adhFirstName = :adhFirstName"),
    @NamedQuery(name = "Tbladherents.findByAdhLastName", query = "SELECT t FROM Tbladherents t WHERE t.adhLastName = :adhLastName")})
public class Tbladherents implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adhId")
    private Integer adhId;
    @Basic(optional = false)
    @Column(name = "adhFirstName")
    private String adhFirstName;
    @Basic(optional = false)
    @Column(name = "adhLastName")
    private String adhLastName;

    public Tbladherents() {
    }

    public Tbladherents(Integer adhId) {
        this.adhId = adhId;
    }

    public Tbladherents(Integer adhId, String adhFirstName, String adhLastName) {
        this.adhId = adhId;
        this.adhFirstName = adhFirstName;
        this.adhLastName = adhLastName;
    }

    public Integer getAdhId() {
        return adhId;
    }

    public void setAdhId(Integer adhId) {
        Integer oldAdhId = this.adhId;
        this.adhId = adhId;
        changeSupport.firePropertyChange("adhId", oldAdhId, adhId);
    }

    public String getAdhFirstName() {
        return adhFirstName;
    }

    public void setAdhFirstName(String adhFirstName) {
        String oldAdhFirstName = this.adhFirstName;
        this.adhFirstName = adhFirstName;
        changeSupport.firePropertyChange("adhFirstName", oldAdhFirstName, adhFirstName);
    }

    public String getAdhLastName() {
        return adhLastName;
    }

    public void setAdhLastName(String adhLastName) {
        String oldAdhLastName = this.adhLastName;
        this.adhLastName = adhLastName;
        changeSupport.firePropertyChange("adhLastName", oldAdhLastName, adhLastName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adhId != null ? adhId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbladherents)) {
            return false;
        }
        Tbladherents other = (Tbladherents) object;
        if ((this.adhId == null && other.adhId != null) || (this.adhId != null && !this.adhId.equals(other.adhId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "crm.Tbladherents[ adhId=" + adhId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
