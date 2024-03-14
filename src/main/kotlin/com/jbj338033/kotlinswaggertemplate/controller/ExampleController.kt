package com.jbj338033.kotlinswaggertemplate.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {
    @GetMapping("/example")
    fun getExample(): String {
        return "Example Template"
    }
}