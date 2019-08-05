package kg.tasks.modules.models.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class ResponseEntity {
    private boolean Success;
    private Object Data;
    private String message;

    public ResponseEntity() {
        this.Success = true;
    }
}
