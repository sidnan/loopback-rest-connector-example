/**
 * 
 */
package demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import demo.entity.Medication;
import demo.repository.MedicationRepository;

/**
 * Service implements the Patient Services
 * @author snandagopal
 *
 */
@Service
@Validated
public class PatientService implements IPatientService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	MedicationRepository medicationRepository;
	
	
	@Override
	@Cacheable("medicationByPatientIdCache")
	@Transactional(readOnly = true)
	public List<Medication> getMedicationByPatientId(Integer patientId) {
		List<Medication> currentMedication = new ArrayList<Medication>();
		
		if(patientId == null) {
			LOGGER.debug("Given patient id is NULL");
			return currentMedication;
		}
		
		LOGGER.debug("Getting medication by patient id="+patientId);
		try {
			currentMedication = medicationRepository.findByPatientId(patientId);
			LOGGER.debug("Retrived '" + currentMedication.size() + "' records for patient id '" + patientId + "'");
		} catch(Exception e) {
			LOGGER.error("Retrieval of medication failed for patient id '" + patientId + "'", e);
		}
		return currentMedication;
	}
	
}
