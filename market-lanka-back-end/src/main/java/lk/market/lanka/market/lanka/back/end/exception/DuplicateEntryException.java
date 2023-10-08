package lk.market.lanka.market.lanka.back.end.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class DuplicateEntryException extends RuntimeException {
    public DuplicateEntryException(String message){
        super(message);
    }
}
