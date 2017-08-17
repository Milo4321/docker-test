package pl.infoshare.jboss.ear.ejb;

import lombok.extern.slf4j.Slf4j;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Slf4j
@Stateless
public class UserEjbImpl implements UserEjb {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public User save(User user) {
        return em.merge(user);
    }

    @Override
    public User get(long id) {
        log.info("Try to get user with id {}", id);
        return em.find(User.class, id);
    }
}
