/*
 * KAYMANTA CIA. LTDA.
 * Sistema: GESTPROY 1.0 - KAYMANTA
 * Creado: 15-sep-2013 - 15:12:12
 * 
 * Los contenidos de este archivo son propiedad intelectual de KAYMANTA CIA. LTDA.
 * y se encuentran protegidos por leyes de propiedad intelectual.
 * 
 * No se puede hacer uso de los mismos sin el expreso consentimiento de KAYMANTA CIA. LTDA.
 * 
 * Copyright 2013-2014 Kaymanta Todos los derechos reservados.
 */
package ec.kaymanta.gestproy.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.persist.common.dao.ResultadoBusqueda;
import ec.kaymanta.gestproy.modelo.Parroquia;
import ec.kaymanta.gestproy.modelo.ParroquiaPK;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * La Clase ParroquiaDAO especifica e implementa las operaciones de acceso a
 * datos relacionadas con la entidad Parroquia.
 *
 * @author JPA Generator
 * @version 1.0
 */
@Stateless
@LocalBean
public class ParroquiaDAO extends DefaultGenericDAOImple<Parroquia, ParroquiaPK> {

    public ParroquiaDAO() {
        super(Parroquia.class);

    }

    public ResultadoBusqueda<Parroquia> find(Parroquia parroquia, ResultadoBusqueda<Parroquia> resultado, String[] order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
