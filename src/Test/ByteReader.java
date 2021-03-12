package Test;

import java.util.Random;
import java.util.Scanner;

public class ByteReader {
    public static void main(String[] args) {
/**
 * Старт игры, на выбор предлагаются 3 героя.
 * В игре одновременно играют 2 человека.
 *
 */
        Scanner scanner = new Scanner(System.in);
        String[] pullHero = {"Warrior", "mage", "witcher", "rogue", "druid", "elemental"};
        playerOne(pullHero);
    }
    static void playerOne(String[] pullHero){
        Random random = new Random();
        String[] pullFirstPlayers = new String[1];
        int timeA = random.nextInt(5);
        String randomHeroOne = pullHero[timeA];
        int timeB = random.nextInt(5);
        String randomHeroTwo = pullHero[timeB];
        int timeC = random.nextInt(5);
        String randomHeroThree = pullHero[timeB];
        pullFirstPlayers[0]=pullHero[1];
        System.out.println(randomHeroOne);
        System.out.println(randomHeroTwo);
        System.out.println(randomHeroThree);
        /**
         * Проблема которую нужно решить:
         * пул героев не может повторяться, у каждого игрока в игре
         * должен быть индивидуальный персонаж
         */
    }
    }
