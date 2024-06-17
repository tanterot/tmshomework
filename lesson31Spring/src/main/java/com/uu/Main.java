package com.uu;

import com.uu.model.User;
import com.uu.service.GameService;
import com.uu.service.impl.HorseServiceImpl;
import com.uu.service.impl.RaceServiceImpl;
import lombok.val;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.uu");
        HorseServiceImpl horseService = context.getBean(HorseServiceImpl.class);
        RaceServiceImpl raceService = context.getBean(RaceServiceImpl.class);
        User user = context.getBean(User.class);
        val gameService = context.getBean(GameService.class);
        gameService.startGame();
    }
}
