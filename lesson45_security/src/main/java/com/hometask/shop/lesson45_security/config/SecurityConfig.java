package com.hometask.shop.lesson45_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


/*

SCryptPasswordEncoder: Этот кодировщик использует алгоритм SCrypt, который также обеспечивает хорошую безопасность.
 Он подходит для систем, где требуется более высокая производительность по сравнению с BCrypt.

Для его использования необходимо добавить зависимость Bouncy Castle :
implementation group: 'org.bouncycastle', name: 'bcprov-jdk15on', version: '1.70'

1.cpuCost (стоимость CPU): Этот параметр определяет количество итераций, которые будут выполнены для вычисления хэша.
 Чем выше значение, тем больше времени и ресурсов потребуется для вычисления хэша. В данном случае, 16384 итерации.
2.memoryCost (стоимость памяти): Этот параметр определяет количество памяти, которое будет использовано для вычисления хэша.
 Опять же, чем выше значение, тем больше памяти будет использовано. Здесь установлено значение 8.
3.parallelization (параллелизация): Этот параметр определяет, сколько потоков будет использовано для параллельного вычисления хэша.
Значение 1 означает, что параллелизация отключена.
4.keyLength (длина ключа): Это длина выходного хэша в байтах. Здесь установлено значение 32 байта.
5.saltLength (длина соли): Соль — это случайная последовательность байтов, добавляемая к паролю перед хэшированием.
Значение 16 означает, что соль будет состоять из 16 байтов.
 */


@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain config(HttpSecurity http) throws Exception {

        return http.authorizeHttpRequests(qw -> {
                    qw
                            .requestMatchers("/home").permitAll()
                            .requestMatchers("/order").hasRole("SELLER")
                            .requestMatchers("/task").authenticated();
//
                })
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    @Bean
    UserDetailsService userDetailsService() {

        var encoder = new SCryptPasswordEncoder(16384, 8, 1, 32, 16);

        UserDetails user1 = User.withUsername("andrey")
                .password(encoder.encode("qwerty"))
                .roles("USER", "SELLER")
                .build();
        UserDetails user2 = User.withUsername("diana")
                .password(encoder.encode("qwerty"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }


    @Bean
    PasswordEncoder encoder() {
      return new SCryptPasswordEncoder(16384, 8, 1, 32, 16);
    }
}
