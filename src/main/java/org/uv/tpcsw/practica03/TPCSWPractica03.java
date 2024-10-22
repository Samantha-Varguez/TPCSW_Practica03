

// hibernate ayuda con dao, como springboot ayuda con repository 
// pojo se convirtio en un entity 
// IDAOGeneral e IDAO empleado

// resolver los otros metodos
package org.uv.tpcsw.practica03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSWPractica03 {
// load es para lazy que se quiere volver eager
    public static void main(String[] args) {
        //hibernate 
        System.out.println("Hello World!");
        Departamentos departamento = new Departamentos();
        departamento.setNombre("Administracion");
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t=session.beginTransaction();
        session.save(departamento);
        
       t.commit();
// load hace referencia
//SessionFactory sf = HibernateUtil.getSessionFactory();
//Session session = sf.getCurrentSession();
//Transaction t = session.beginTransaction();
//Departamento dep=session.get(Departamento.class, 1L);
//
//if (dep!= null){
//    System.out.println("Clave" + dep.getClave()+ "nom"+ dep.getNombre());
//Set<Empleado> 1stEmpleado = dep.getEmpleados();
//for (Empleado enpleado1 = 1stEmpleado){
//    System.out.println("clave" + empleado.getNombre);
//}
//}
//        t.commit();
        
    }
}
