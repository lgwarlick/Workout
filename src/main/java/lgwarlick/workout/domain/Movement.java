package lgwarlick.workout.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movement extends BaseEntity{
    private String name;
    private String unitOfMeasure;
}
