package org.uzum.iggytoto.java_DI.service;

import lombok.RequiredArgsConstructor;
import org.uzum.iggytoto.java_DI.dal.UserRepository;
import org.uzum.iggytoto.java_DI.model.User;

@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createNewUser(String name, int money) {
        return userRepository.saveOrUpdate(User.builder().balance(money).name(name)
                .build());
    }

    public void decreaseBalance(User user, int amountDecrease) {
        user.setBalance(user.getBalance() - amountDecrease);
    }

    public void deacreaseBalance(int userId, int amountDecrease){
        var user = userRepository.getById(userId);
        user.setBalance(user.getBalance() - amountDecrease);
        userRepository.saveOrUpdate(user);
    }
}
