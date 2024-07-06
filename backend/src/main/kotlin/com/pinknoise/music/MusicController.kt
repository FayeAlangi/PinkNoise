package com.pinknoise.music

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MusicController {
    @GetMapping("/healthcheck")
    fun  getHealthCheck(): String{
        return "Hello Music!"
    }
}