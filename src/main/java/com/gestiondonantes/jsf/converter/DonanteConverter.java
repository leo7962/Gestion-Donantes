package com.gestiondonantes.jsf.converter;
import com.gestiondonantes.dominio.Donante;
import javax.faces.convert.Converter;
import org.springframework.roo.addon.jsf.converter.RooJsfConverter;

@RooJsfConverter(entity = Donante.class)
public class DonanteConverter implements Converter {
}
