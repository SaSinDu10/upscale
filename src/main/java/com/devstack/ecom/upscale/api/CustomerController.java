package com.devstack.ecom.upscale.api;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping
    public String create(@RequestBody RequestCustomerDto dto) {
        return "create()";
    }

    @GetMapping("/{id}")
    public String get(@PathVariable String id) {
        return "get()";
    }

    @PutMapping
    public String update(@RequestBody RequestCustomerDto dto) {
        return "update()";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return "delete()";
    }

    @GetMapping("/list")
    public String findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ) {
        return "findAll()";
    }
}

//http://localhost:8001/api/v1/customers -- POST (save)
//http://localhost:8001/api/v1/customers -- PUT (update)
//http://localhost:8001/api/v1/customers -- GET (findAll)
//http://localhost:8001/api/v1/customers/list -- GET (find)
//http://localhost:8001/api/v1/customers -- DELETE (remove)


