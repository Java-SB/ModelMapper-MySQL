package art.magnet.partner.u202023992.si729ebu202023992.common.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
