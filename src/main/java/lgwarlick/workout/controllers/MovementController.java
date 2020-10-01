package lgwarlick.workout.controllers;

import lgwarlick.workout.services.MovementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MovementController {

    private final MovementService movementService;

    public MovementController(MovementService movementService) {
        this.movementService = movementService;
    }

    @GetMapping("/movements")
    public String listMovements(Model model) {

        model.addAttribute("movement", movementService.getMovements());

        return null;
    }
}
