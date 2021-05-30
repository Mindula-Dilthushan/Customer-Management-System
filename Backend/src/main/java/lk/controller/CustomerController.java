package lk.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getCustomer(){
        return "getCustomer";
    }

    @PostMapping
    public String saveCustomer(){
        return "Save Customer";
    }
}
