package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String getDate(){
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter f1= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate=date.format(f1);
        return formattedDate;
    }


}
