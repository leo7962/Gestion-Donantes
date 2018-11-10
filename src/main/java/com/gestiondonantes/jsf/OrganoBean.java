package com.gestiondonantes.jsf;
import com.gestiondonantes.dominio.Organo;
import org.springframework.roo.addon.jsf.managedbean.RooJsfManagedBean;
import org.springframework.roo.addon.serializable.RooSerializable;

@RooSerializable
@RooJsfManagedBean(entity = Organo.class, beanName = "organoBean")
public class OrganoBean {
}
