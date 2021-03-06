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
import ec.kaymanta.gestproy.modelo.LeccionesAprendidas;
import ec.kaymanta.gestproy.modelo.LeccionesAprendidasPK;
import ec.kaymanta.gestproy.modelo.Proyecto;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 * La Clase LeccionesAprendidasDAO especifica e implementa las operaciones de
 * acceso a datos relacionadas con la entidad LeccionesAprendidas.
 *
 * @author JPA Generator
 * @version 1.0
 */
@Stateless
@LocalBean
public class LeccionesAprendidasDAO extends DefaultGenericDAOImple<LeccionesAprendidas, LeccionesAprendidasPK> {

    public LeccionesAprendidasDAO() {
        super(LeccionesAprendidas.class);

    }

    public List<LeccionesAprendidas> getByProyecto(Proyecto proyecto) {
        String sql = "SELECT obj FROM LeccionesAprendidas obj WHERE obj.proyecto=?1";
        Query qry = this.getEntityManager().createQuery(sql);
        qry.setParameter(1, proyecto);
        return qry.getResultList();
    }
}
