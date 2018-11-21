package Main_Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructureDatabaseRepository extends CrudRepository<StructureDatabase, Long> {
}
