package com.kafein.intern.warehouse.client;

import com.kafein.intern.warehouse.dto.SimpleEmailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service", url = "http://localhost:8081")
public interface MailServiceClient {

    @PostMapping("/module/email/send")
    public ResponseEntity<?> send(@RequestBody SimpleEmailDTO simpleEmailDTO);

}
