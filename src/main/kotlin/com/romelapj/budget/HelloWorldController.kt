package com.romelapj.budget

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloWorldController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello World"
    }
}