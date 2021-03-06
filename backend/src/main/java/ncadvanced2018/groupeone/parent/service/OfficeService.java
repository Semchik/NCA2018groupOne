package ncadvanced2018.groupeone.parent.service;

import ncadvanced2018.groupeone.parent.model.entity.Address;
import ncadvanced2018.groupeone.parent.model.entity.Office;

import java.util.List;

public interface OfficeService {
    Office create(Office office);

    Office findById(Long id);

    Office update(Office office);

    boolean delete(Office office);

    boolean delete(Long id);

    List <Office> findByName(String name);

    List <Office> findByAddress(Address address);

    List <Office> findAll();

    List <Office> findAllActive();

    List <Office> findByStreet(String street);

    List <Office> findAllWithAddress();

    List <Office> findAll(String sortedField, boolean asc);

}
