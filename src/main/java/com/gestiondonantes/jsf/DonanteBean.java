package com.gestiondonantes.jsf;
import com.gestiondonantes.dominio.Donante;
import org.springframework.roo.addon.jsf.managedbean.RooJsfManagedBean;
import org.springframework.roo.addon.serializable.RooSerializable;

@RooSerializable
@RooJsfManagedBean(entity = Donante.class, beanName = "donanteBean")
public class DonanteBean {
}
