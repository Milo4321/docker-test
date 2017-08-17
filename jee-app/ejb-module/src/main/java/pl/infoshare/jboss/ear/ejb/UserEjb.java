package pl.infoshare.jboss.ear.ejb;

import javax.ejb.Remote;

@Remote
public interface UserEjb {
    User save(User user);

    User get(long id);
}
