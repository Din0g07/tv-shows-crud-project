package org.example;

import org.example.service.CharacterService;

public class Main {
    public static void main(String[] args) {
        CharacterService characterService = new CharacterService();
        //characterService.createCharacter();
        System.out.println("Info: " + characterService.getCharacterByName("Fry").getInfo());
        characterService.getAllShowCharacters().forEach(System.out::println);
        System.out.println("Character: Fry \nSeries: " + characterService.getSeriesByCharacterName("Fry"));
    }
}