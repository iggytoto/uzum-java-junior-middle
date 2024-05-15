package org.uzum.iggytoto.java_DI;

import lombok.SneakyThrows;
import org.uzum.iggytoto.java_DI.dal.PostgreUserRepositoryImpl;
import org.uzum.iggytoto.java_DI.service.UserService;

public class DependencyInjectionExample {

    @SneakyThrows
    public static void main(String... args){
        //injector logic
        final var userRepository = new PostgreUserRepositoryImpl();
        final var userService = new UserService(userRepository);
        // end injectior logic
        final var user = userService.createNewUser("test", 1000);

        userRepository.saveOrUpdate(user);

        Thread.sleep(1000);

        final var user1 = userRepository.getById(user.getId());

        userService.decreaseBalance(user, 100);

        userRepository.saveOrUpdate(user1);

    }
}
