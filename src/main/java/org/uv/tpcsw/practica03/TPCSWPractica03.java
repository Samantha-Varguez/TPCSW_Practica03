
package org.uv.tpcsw.practica03;

import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSWPractica03 {
// load es para lazy que se quiere volver eager
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//Empleado empleado = new Empleado ();
//empleado.setNombre("Juan");
//empleado.setDireccion("Av3");
//empleado.setTelefono("12345");
//SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session session = sf.getCurrentSession();
//       Transaction t=session.beginTransaction();
//       session.save(empleado);
//
// BUSCAR TODOS los empleados


//        List<Empleado> listaEmpleados = session.createQuery("from Empleado").list();
//        System.out.println("Lista de todos los empleados:");
//        for (Empleado emp : listaEmpleados) {
//            System.out.println("Clave: " + emp.getClave() + ", Nombre: " + emp.getNombre() + ", Direccion: " + emp.getDireccion() + ", Teléfono: " + emp.getTelefono());
//        }
//
//        
//        

// Agregar Departamento

//        Departamento departamento = new Departamento();
//        departamento.setNombre("Contaduria");
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session session = sf.getCurrentSession();
//        Transaction t=session.beginTransaction();
//        session.save(departamento);
////        
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
//        t.commit();

    }
}
