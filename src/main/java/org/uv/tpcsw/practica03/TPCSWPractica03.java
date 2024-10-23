
package org.uv.tpcsw.practica03;

import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSWPractica03 {
// load es para lazy que se quiere volver eager
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
Empleado empleado = new Empleado ();
empleado.setNombre("Sam");
empleado.setDireccion("Av2");
empleado.setTelefono("1234");
SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
       Transaction t=session.beginTransaction();
       session.save(empleado);

        
//        
//        Departamento departamento = new Departamento();
//        departamento.setNombre("Administracion");
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session session = sf.getCurrentSession();
//        Transaction t=session.beginTransaction();
//        session.save(departamento);
//        
//       t.commit();

//SessionFactory sf = HibernateUtil.getSessionFactory();
//Session session = sf.getCurrentSession();
//Transaction t = session.beginTransaction();
//Departamento dep=session.get(Departamento.class, 1L);
//
//        if (dep != null) {
//            System.out.println("Clave:" +dep.getClave()+ "nom:" + dep.getNombre());
//            Set<Empleado> lstEmpleado = dep.getEmpleados();
//            for (Empleado empleado1 : lstEmpleado) {
//                System.out.println("clave:" + empleado1.getNombre());
//            }
//        }
        t.commit();

    }
}
