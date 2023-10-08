package lk.market.lanka.market.lanka.back.end.advicer;

import lk.market.lanka.market.lanka.back.end.exception.DuplicateEntryException;
import lk.market.lanka.market.lanka.back.end.exception.NotFoundException;
import lk.market.lanka.market.lanka.back.end.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e){
        return new ResponseEntity<StandardResponse>(new StandardResponse(404,"error",e.getMessage()), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(DuplicateEntryException.class)
    public ResponseEntity<StandardResponse> handleDuplicateEntry(DuplicateEntryException e){
        return new ResponseEntity<StandardResponse>(new StandardResponse(404,"Error",e.getMessage()),HttpStatus.CONFLICT);
    }
}
