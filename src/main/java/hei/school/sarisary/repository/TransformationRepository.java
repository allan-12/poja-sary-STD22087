package hei.school.sarisary.repository;

import org.apache.tomcat.websocket.Transformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface TransformationRepository extends CrudRepository<Transformation, String> {
    @Override
    Optional<Transformation> findById(String id);
}
