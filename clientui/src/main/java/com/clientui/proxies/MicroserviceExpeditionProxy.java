package com.clientui.proxies;


import com.clientui.beans.ExpeditionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-expedition")
public interface MicroserviceExpeditionProxy {

  @PostMapping(value = "/Microservice-expedition/expeditions")
  ResponseEntity<ExpeditionBean> ajouterExpedition(@RequestBody ExpeditionBean expeditionBean);

  @GetMapping(value = "/Microservice-expedition/suivi/{idCommande}")
  public Optional<ExpeditionBean> etatExpedition(@PathVariable("idCommande") int idCommande);
}
