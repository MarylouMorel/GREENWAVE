package com.back.demo.controller;

import com.back.demo.DTO.SessionRequestDTO;
import com.back.demo.entity.Session;
import com.back.demo.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/sessions")
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @PostMapping
    public ResponseEntity<Session> creerSession(@RequestBody SessionRequestDTO request,
                                                @RequestParam int createurId) {
        Session session = sessionService.creerSession(
                request.getTitre(),
                request.getDescription(),
                request.getDateSession(),
                request.getHeureSession(),
                request.getAdresse(),
                request.getNombrePlaces(),
                createurId
        );
        return ResponseEntity.ok(session);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerSession(@PathVariable int id) {
        sessionService.supprimerSession(id);
        return ResponseEntity.noContent().build(); // renvoie 204
    }

}
