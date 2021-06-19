/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovehiculo;

import model.VehiculoJPA;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author Pedro
 */
public class EjercicioVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoJPA vehiculoJPA = new VehiculoJPA();
        vehiculoJPA.setMarca("Chevrolet");
        vehiculoJPA.setModelo(2020);
        vehiculoJPA.setPlaca("OPA273");
         Session session = HibernateUtil.getSessionFactory().openSession();
        try{
        session.beginTransaction();
        session.save(vehiculoJPA);
        session.getTransaction().commit();
        } catch(HibernateException e){
            session.getTransaction().rollback();
            System.out.println("Error: "+e.getMessage());
        }finally{
            session.close();
        }
    }
    
}
