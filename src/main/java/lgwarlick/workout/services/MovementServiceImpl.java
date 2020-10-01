package lgwarlick.workout.services;

import lgwarlick.workout.domain.Movement;
import lgwarlick.workout.repository.MovementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class MovementServiceImpl implements MovementService {

    private final MovementRepository movementRepository;

    public MovementServiceImpl(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    @Override
    public Set<Movement> getMovements() {
        return null;
    }

    @Override
    public Movement findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
