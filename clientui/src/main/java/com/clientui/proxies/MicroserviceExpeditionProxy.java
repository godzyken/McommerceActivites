package com.clientui.proxies;


import com.clientui.beans.ExpeditionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-expedition")
public interface MicroserviceExpeditionProxy {

  @GetMapping(value = "/microservice-expedition/Expeditions/{id}")
  ExpeditionBean afficherUneExpedition(@PathVariable("id") int id);

  @PutMapping(value="/microservice-expedition/Expeditions")
  ExpeditionBean modifierExpedition(@RequestBody ExpeditionBean expeditionUpD);

  @PostMapping(value = "/Microservice-expedition/expeditions")
  ResponseEntity<ExpeditionBean> ajouterExpedition(@RequestBody ExpeditionBean expeditionBean);

  @GetMapping(value = "/Microservice-expedition/suivi/{idCommande}")
  Optional<ExpeditionBean> etatExpedition(@PathVariable("idCommande") int idCommande);
}
