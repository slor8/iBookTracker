package edu.matc.persistence;

import edu.matc.entity.IssueBook;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type IssueBook dao.
 */
public class IssueBookDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all issueBooks
     *
     * @return the all issueBooks
     */
    public List<IssueBook> getAllIssueBooks() {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<IssueBook> query = builder.createQuery(IssueBook.class);
        Root<IssueBook> root = query.from(IssueBook.class);
        List<IssueBook> issueBooks = session.createQuery(query).getResultList();
        session.close();
        return issueBooks;
    }


    public IssueBook getById(int id) {


        Session session = sessionFactory.openSession();
        IssueBook issueBook = session.get(IssueBook.class, id);
        session.close();
        return issueBook;
    }

    public void saveOrUpdate(IssueBook issueBook) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(issueBook);
        transaction.commit();
        session.close();
    }

    /**
     * Create int.
     *
     * @param issueBook the issueBook
     * @return the int
     */
    public int insert(IssueBook issueBook) {

        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(issueBook);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete.
     *
     * @param issueBook the issueBook
     */
    public void delete(IssueBook issueBook) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(issueBook);
        transaction.commit();
        session.close();
    }


}
