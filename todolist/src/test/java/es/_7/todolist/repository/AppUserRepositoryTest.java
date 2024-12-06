package es._7.todolist.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import es._7.todolist.models.AppUser;
import es._7.todolist.repositories.AppUserRepository;

@DataJpaTest
class AppUserRepositoryTest {
    @Autowired
    private AppUserRepository userRepository;

    @Test
    @Disabled
    void saveUser() {
        AppUser user = new AppUser();
        user.setUsername("user1");
        user.setEmail("d@gmail.com");

        AppUser savedUser = userRepository.save(user);

        assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getUsername()).isEqualTo(user.getUsername());
        assertThat(savedUser.getEmail()).isEqualTo(user.getEmail());
    }

}
