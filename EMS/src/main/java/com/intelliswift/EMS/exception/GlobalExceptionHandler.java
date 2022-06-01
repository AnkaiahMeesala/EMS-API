//package com.intelliswift.EMS.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.intelliswift.EMS.utils.APIResponse;
//import com.intelliswift.EMS.utils.ResourceNotFound;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(ResourceNotFound.class)
//    public ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFound res){
//        String msg = res.getMessage();
//        APIResponse response = new APIResponse(msg, "Failed");
//
//        return new ResponseEntity<APIResponse>(response, HttpStatus.NOT_FOUND);
//    }
//}
