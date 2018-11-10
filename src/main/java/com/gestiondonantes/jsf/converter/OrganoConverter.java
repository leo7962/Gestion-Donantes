package com.gestiondonantes.jsf.converter;
import com.gestiondonantes.dominio.Organo;
import javax.faces.convert.Converter;
import org.springframework.roo.addon.jsf.converter.RooJsfConverter;

@RooJsfConverter(entity = Organo.class)
public class OrganoConverter implements Converter {
}
