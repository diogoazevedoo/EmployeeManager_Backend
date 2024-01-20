package pt.diogoazevedo.SpringAngularFullStack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.diogoazevedo.SpringAngularFullStack.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
