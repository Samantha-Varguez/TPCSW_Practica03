

// hibernate ayuda con dao, como springboot ayuda con repository 
// pojo se convirtio en un entity 
// IDAOGeneral e IDAO empleado

// resolver los otros metodos
package org.uv.tpcsw.practica03;

import org.hibernate.SessionFactory;

public class TPCSWPractica03 {

    public static void main(String[] args) {
        //hibernate 
        System.out.println("Hello World!");
        SessionFactory sf = HibernateUtil.getSessionFactory();
    }
}
