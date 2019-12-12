package kea.examgroup.wizkidscanteenprogram.repository;

import kea.examgroup.wizkidscanteenprogram.model.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {


}
