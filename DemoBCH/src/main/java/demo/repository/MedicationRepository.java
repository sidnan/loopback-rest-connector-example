/**
 * 
 */
package demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import demo.entity.Medication;

/**
 * Repository based on springframework PagingAndSortingRepository
 * for Medication view
 * @author snandagopal
 *
 */
public interface MedicationRepository extends PagingAndSortingRepository<Medication, Integer>{

    /**
     * Given patient id, get medication patient is on 
     * @param patientId
     * @return
     */
    public List<Medication> findByPatientId(Integer patientId);
}
