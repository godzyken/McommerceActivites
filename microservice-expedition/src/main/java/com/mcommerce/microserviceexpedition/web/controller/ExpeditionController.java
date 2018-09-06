package com.mcommerce.microserviceexpedition.web.controller;

import com.mcommerce.microserviceexpedition.dao.ExpeditionDao;
import com.mcommerce.microserviceexpedition.model.Expedition;
import com.mcommerce.microserviceexpedition.web.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExpeditionController {

    @Autowired
    ExpeditionDao expeditionDao;

    @PostMapping(value = "/expeditions")
  public ResponseEntity<Expedition> ajouterUneExpedition(@RequestBody Expedition expedition){

      Expedition nouvelleExpedition = expeditionDao.save(expedition);

      if(nouvelleExpedition == null) throw new ImpossibleAjouterCommandeException("Impossible d'ajouter cette commande");

      return new ResponseEntity<Expedition>(expedition, HttpStatus.CREATED);
    }

    @GetMapping(value = "/expeditions/{id}")
  public Optional<Expedition> recupererUneExpedition(@PathVariable int id){

      Optional<Expedition> expedition = expeditionDao.findById(id);

      if(!expedition.isPresent()) throw new ExpeditionNotFoundException("Cette expedition n'existe pas");

      return expedition;
    }

    @PutMapping(value = "/expeditions")
  public void updateExpedition(@RequestBody Expedition expedition){

      expeditionDao.save(expedition);
    }
}
