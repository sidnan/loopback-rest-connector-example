/**
 * 
 */
package demo.service.test;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import demo.Application;
import demo.entity.Medication;
import demo.repository.MedicationRepository;
/**
 * This test the PatientService.class methods {@link demo.service.PatientService}
 * @author snandagopal
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class PatientServiceTest {

	@Autowired
	MedicationRepository mockMedicationRepository;
	
	/**
	 * Test given a patient id
	 * is data not null and is the data count matched with the expected count
	 */
	@Test
	public void findMedicationsByPatientId() {
		Integer mockPatientId = new Integer(1);
		List<Medication> medicationList = mockMedicationRepository.findByPatientId(mockPatientId);
		assertNotNull(medicationList);
		assertThat(new Long(medicationList.size()), is(greaterThanOrEqualTo(18L)));
	}
	
}
