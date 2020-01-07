package builders.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Entity {
    @NonNull
    private String name;
    private int points;
}
