// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.gestiondonantes.jsf.converter;

import com.gestiondonantes.dominio.Organo;
import com.gestiondonantes.jsf.converter.OrganoConverter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

privileged aspect OrganoConverter_Roo_Converter {
    
    declare @type: OrganoConverter: @FacesConverter("com.gestiondonantes.jsf.converter.OrganoConverter");
    
    public Object OrganoConverter.getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        Long id = Long.parseLong(value);
        return Organo.findOrgano(id);
    }
    
    public String OrganoConverter.getAsString(FacesContext context, UIComponent component, Object value) {
        return value instanceof Organo ? ((Organo) value).getId().toString() : "";
    }
    
}
