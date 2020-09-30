package lgwarlick.workout.services;

import lgwarlick.workout.domain.Movement;

import java.util.Set;

public interface MovementService {

    Set<Movement> getMovements();

    Movement findById(Long id);

    void deleteById(Long id);

}
