package org.uzum.iggytoto.java_DI.dal;

import org.uzum.iggytoto.java_DI.model.User;

import java.util.ArrayList;

public class UserRepositoryImpl implements UserRepository {

    private static final ArrayList<User> DATABASE = new ArrayList<>();
    private static int LAST_ID = 1;

    @Override
    public User saveOrUpdate(User u) {
        if (u.getId() == null) {
            u.setId(LAST_ID++);
            DATABASE.add(u);
            return u;
        }

        var userInDataBase = getById(u.getId());
        DATABASE.remove(userInDataBase);
        DATABASE.add(u);
        return u;
    }

    @Override
    public User getById(int id){
        return DATABASE.stream().filter(us -> us.getId().equals(id)).findFirst().orElseThrow();
    }

}
