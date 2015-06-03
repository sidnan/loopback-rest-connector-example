/**
 * 
 */
package demo.service;

import java.util.List;

import demo.entity.Medication;

/**
 * Interface declaring list of services provided to the patient
 * @author snandagopal
 *
 */
public interface IPatientService {

	List<Medication> getMedicationByPatientId(Integer patientId);

}
