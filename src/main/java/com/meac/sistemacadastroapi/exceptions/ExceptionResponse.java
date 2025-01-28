package com.meac.sistemacadastroapi.exceptions;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExceptionResponse that = (ExceptionResponse) o;
        return Objects.equals(timestamp, that.timestamp) && Objects.equals(message, that.message) && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, message, details);
    }
}
