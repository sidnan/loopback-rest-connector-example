/**
 * 
 */
package demo.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

import com.google.common.base.Objects;

/**
 * Entity for the Medication view
 * @author snandagopal
 *
 */
@Entity
@Immutable
public class Medication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private Integer patientId;
	
	private String drugName;
	
	private String drugCompany;
	
	private Date startDate;
	
	private Integer days;
	

	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	
	public String getDrugCompany() {
		return drugCompany;
	}
	public void setDrugCompany(String drugCompany) {
		this.drugCompany = drugCompany;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	
	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("drugName", drugName)
                .toString();
    }
	
}
