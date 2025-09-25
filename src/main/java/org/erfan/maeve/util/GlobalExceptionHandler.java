package org.erfan.maeve.util;

import jakarta.servlet.http.HttpServletRequest;
import org.erfan.maeve.entity.AppException;
import org.erfan.maeve.entity.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(AppException.class)
    public ResponseEntity<String> handleAppException(AppException ex, HttpServletRequest req) {
        ErrorCode code = ex.getErrorCode();

        // log details for server-side debugging (don't expose stacktrace to client)
        log.warn("AppException: {} - {} - path={}", code.getCode(), ex.getMessage(), req.getRequestURI());

        return ResponseEntity.status(code.getCode()).body(code.getMessage());
    }

    // fallback: بقیه استثناها
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleOtherExceptions(Exception ex, HttpServletRequest req) {

        log.error("Unhandled exception for path={}", req.getRequestURI(), ex);

        return ResponseEntity.status(ErrorCode.INTERNAL_ERROR.getCode()).body(ErrorCode.INTERNAL_ERROR.getMessage());
    }
}
