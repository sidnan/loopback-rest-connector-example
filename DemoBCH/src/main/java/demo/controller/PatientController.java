/**
 * 
 */
package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Medication;
import demo.service.IPatientService;

/**
 * Controller which accepts the request from client,
 * process
 * and respond
 * @author snandagopal
 *
 */
@RestController
public class PatientController {

	@Autowired
	IPatientService patientService;


	/**
	 * get medication by patient id
	 * @param patientId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/medication/{patientId}")
	public List<Medication> getMedicationByPatientId(@PathVariable("patientId") Integer patientId) {
		return patientService.getMedicationByPatientId(patientId);
	}
}
