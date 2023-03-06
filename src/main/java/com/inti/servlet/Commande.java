package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Utilisateur;
import com.inti.model.UtilisateurDetails;
import com.inti.util.HibernateUtil;

/**
 * Servlet implementation class Commande
 */
@WebServlet("/Commande")
public class Commande extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Session s;
	private Logger log = LogManager.getLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Commande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		s=HibernateUtil.getSessionFactory().openSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/pageCommande.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try 
		{
			s.beginTransaction();
			
			log.info("Début enregistrement commande");
			
			com.inti.model.Commande c1=new com.inti.model.Commande(LocalDate.parse(request.getParameter("date")));
			Utilisateur u1 = s.get(Utilisateur.class, Integer.parseInt(request.getParameter("idUser")) );
			
			c1.setUser(u1);
			s.save(c1);
			s.getTransaction().commit();
			
			
			
			log.info("Commande enregistrée");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
			
			s.getTransaction().rollback();
		}
		
		doGet(request, response);
	}

}
