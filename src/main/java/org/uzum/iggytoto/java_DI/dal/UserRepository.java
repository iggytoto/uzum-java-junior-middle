package org.uzum.iggytoto.java_DI.dal;

import org.uzum.iggytoto.java_DI.model.User;

public interface UserRepository {
    User saveOrUpdate(User u);

    User getById(int id);
}
