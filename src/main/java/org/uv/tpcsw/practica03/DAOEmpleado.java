
package org.uv.tpcsw.practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOEmpleado implements IDAOGeneral <Empleado, Long> {

    
    @Override
    public boolean save(Empleado pojo) {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction t = session.beginTransaction();
    session.save(pojo);
    t.commit();
    return true;
    }
    
    
    
    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();

        Empleado empleado = session.get(Empleado.class, id);
        if (empleado != null) {
            session.delete(empleado);
            t.commit();
            return true;
        } else {
            t.rollback();
            return false;
        }
    }

    @Override
    public boolean update(Empleado pojo, Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();

        Empleado empleadoExistente = session.get(Empleado.class, id);
        if (empleadoExistente != null) {
            empleadoExistente.setNombre(pojo.getNombre());
            empleadoExistente.setDireccion(pojo.getDireccion());
            empleadoExistente.setTelefono(pojo.getTelefono());
            // Otros campos que desees actualizar
            session.update(empleadoExistente);
            t.commit();
            return true;
        } else {
            t.rollback();
            return false;
        }
    }

    @Override
    public List<Empleado> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();

        List<Empleado> empleados = session.createQuery("from Empleado", Empleado.class).list();
        t.commit();

        return empleados;
    }

    @Override
    public Empleado findByID(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();

        Empleado empleado = session.get(Empleado.class, id);
        t.commit();

        return empleado;
    }

}
    

// como llenar la tabla 