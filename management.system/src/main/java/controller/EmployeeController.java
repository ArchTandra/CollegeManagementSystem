package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/users")
    public String getMessage()
    {
        return "Adithya";
    }


    @GetMapping("/empId")
    public String getEmployeeId()
    {
        return "123";
    }
}
