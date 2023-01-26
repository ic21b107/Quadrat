package com.fhtw.quadrat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadratApplicationController {
    @GetMapping("/square")
    public int returnSquare(int number) {
        return (int) Math.pow(number, 2);
    }
}
