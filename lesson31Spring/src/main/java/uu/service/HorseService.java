package uu.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import uu.model.Horse;

import java.util.List;
import java.util.stream.IntStream;

@Component
@Getter
@RequiredArgsConstructor
public class HorseService {

    private final List<Horse> horses;

    public void displayHorses() {
        System.out.println("List of horses:");
        IntStream.range(0, horses.size())
                .forEach(i -> System.out.println((i + 1) + ". " + horses.get(i).getName()));
    }

    public Horse getHorse(int horseNum) {
        return horses.get(horseNum - 1);
    }
}
