package com.planifcarbon.backend.controllers;

import com.planifcarbon.backend.dtos.DummyDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * The controller used to get information about the network.
 */
@RestController
@RequestMapping("/api/metro")
public class MetroController {

    private static final Logger logger = LoggerFactory.getLogger(MetroController.class);

    /**
     * Find the available metro lines in the network.
     * @return a list of metro lines
     */
    @GetMapping("/list")
    public ResponseEntity<DummyDTO> getMetroList() {
        logger.info("Request to get Metro list");
        return ResponseEntity.ok(null);
    }

    /**
     * Get the metro information using the line number.
     * @param metroId the metro line number to search with.
     * @return the information about the metro line.
     */
    @GetMapping("/{metroId}")
    public ResponseEntity<DummyDTO> getMetroInformation(
            @PathVariable String metroId
    ) {
        logger.info("Request to get metro information by id : {}", metroId);
        return ResponseEntity.ok(null);
    }
}
