package lgwarlick.workout.services;

import lgwarlick.workout.domain.UoM;
import lgwarlick.workout.repository.UoMRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class UoMServiceImpl implements UoMService {

    private final UoMRepository uoMRepository;

    public UoMServiceImpl(UoMRepository uoMRepository) {
        this.uoMRepository = uoMRepository;
    }

    @Override
    public Set<UoM> listAllUoM() {
        return null;
    }
}
