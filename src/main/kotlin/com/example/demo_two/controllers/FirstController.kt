package com.example.demo_two.controllers

import lombok.extern.java.Log
import lombok.extern.log4j.Log4j
import org.springframework.web.bind.annotation.*

@Log
@RestController
@RequestMapping("api/v1")
class FirstController {

    @GetMapping("first")
    fun getResponse(@RequestParam requestString: String): String {
        println(requestString)
        return when (requestString) {
            "Ты пидор" -> "А может ты?"
            else -> "Здарова Димон"
        }
    }
}