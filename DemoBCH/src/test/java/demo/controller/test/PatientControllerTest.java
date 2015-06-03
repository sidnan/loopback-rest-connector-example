/**
 * 
 */
package demo.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import demo.Application;


/**
 * This has the test cases to check the PatientController.class {@link demo.controller.PatientController.Class}
 * @author snandagopal
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ActiveProfiles("ehcache")
@SpringApplicationConfiguration(classes = Application.class)
public class PatientControllerTest {

	
	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;
	
	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	/**
	 * test to get medication by valid patient id
	 * checks response
	 * * status
	 * * content type
	 * * content string
	 * @throws Exception
	 */
	@Test
	public void findMedicationByValidPatientIdTest() throws Exception {

		this.mvc.perform(
				get("/medication/{id}", 2).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(content().string("[{\"patientId\":2,\"drugName\":\"Advil3\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil7\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil11\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil10\",\"drugCompany\":\"Ace1\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil6\",\"drugCompany\":\"Ace1\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil2\",\"drugCompany\":\"Ace1\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil4\",\"drugCompany\":\"Ace2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil8\",\"drugCompany\":\"Ace2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil12\",\"drugCompany\":\"Ace2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil11\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil7\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120},{\"patientId\":2,\"drugName\":\"Advil3\",\"drugCompany\":\"Acme2\",\"startDate\":\"2015-02-02\",\"days\":120}]"));
	}
	
	/**
	 * test to check no medication record by valid patient id
	 * checks response
	 * * status
	 * * content type
	 * * content string
	 * @throws Exception
	 */
	@Test
	public void findNoMedicationByPatientIdTest() throws Exception {

		this.mvc.perform(
				get("/medication/{id}", 3).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(content().string("[]"));
	}
	
	
	/**
	 * test to check whether media type other than JSON (XML) are not processed
	 * and responds with 4xx
	 * @throws Exception
	 */
	@Test
	public void invalidMediaTypeTest() throws Exception {

		this.mvc.perform(
				get("/medication/{id}", 3).accept(MediaType.APPLICATION_XML))
				.andExpect(status().is4xxClientError());
	}
	
	/**
	 * test to check whether illegal argument like NULL throws exception
	 * @throws Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void findMedicationByNullTest() throws Exception {

		this.mvc.perform(
				get("/medication/{id}", null))
				.andExpect(status().is(400));
	}
	
	
	/**
	 * test to check invalid path
	 * and the response is status not found
	 * @throws Exception
	 */
	@Test
	public void invalidPathTest() throws Exception {

		this.mvc.perform(
				get("/hi"))
				.andExpect(status().isNotFound());
	}
}
