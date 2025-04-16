package se.edugrade.membersapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private String item;
    private String field;
    private Object value;

    public ResourceNotFoundException (String item, String field, Object value) {
        super(String.format("Resource %s not found", item, field, value));
    }
}
