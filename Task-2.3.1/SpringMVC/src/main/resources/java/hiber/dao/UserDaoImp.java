package hiber.dao;
import hiber.model.User;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
            entityManager.persist(user);
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Transactional
    public void update(long id, User new_user) {
        User user = findById(id);
        user.setFirstName(new_user.getFirstName());
        user.setLastName(new_user.getLastName());
        user.setEmail(new_user.getEmail());
        entityManager.merge(user);
    }

    @Transactional
    public void delete(long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
