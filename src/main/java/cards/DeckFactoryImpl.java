package cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import effects.Armored;
import effects.Elusive;
import effects.Exalted;
import effects.Poison;
import shared.CardIDgenerator;
import shared.CardIDgeneratorImpl;

public class DeckFactoryImpl implements DeckFactory {
    
    final List<Card> playerDeck = new ArrayList<>();
    final List<Card> playerIADeck = new ArrayList<>();
    final CardIDgenerator idGenerator = CardIDgeneratorImpl.getIntance();

    @Override
    public List<Card> getPlayerDeck() {
        
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerDeck.add(new CardFactoyImpl().poisonEffect(idGenerator.generateID(), "Vipera", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerDeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Terrapiattista", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studiato", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerDeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Ladro", 1, 3, 3));
        this.playerDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Lucertola Rossa", 1, 1, 3, "Coccodrillo Rosso", 3, 3, Optional.empty()));
        this.playerDeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Lucertola Rossa", 1, 1, 3, "Coccodrillo Rosso", 3, 3, Optional.empty()));
        this.playerDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "G3n0s", 4, 1, 5));
        this.playerDeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Chierico", 3, 2, 3));
        this.playerDeck.add(new CardFactoyImpl().armoredEffect(idGenerator.generateID(), "Templare", 2, 4, 5));
        this.playerDeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Dinosauro", 6, 6, 6));
        
        return this.playerDeck;
    }

    @Override
    public List<Card> getPlayerIADeck() {
        
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Cane", 1, 1, 1));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Calendula", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "Sasso", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Corteo no Vax", 1, 3, 4));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Terrapiattista", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().poisonEffect(idGenerator.generateID(), "Ratto", 2, 1, 3));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Studiato", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Pesca", 1, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Mimic", 3, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Melma", 4, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Melma", 4, 2, 4));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Mummia", 1, 4, 3));
        this.playerIADeck.add(new CardFactoyImpl().rottenEffect(idGenerator.generateID(), "Mummia", 1, 4, 3));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Guts", 1, 4, 3, "Berserk", 2, 5, Optional.of(new Elusive())));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Uovo", 8, 0, 8, "Fafnir Drago Antico", 8, 8, Optional.of(new Armored())));
        
        return this.playerIADeck;
    }
    
    public List<Card> getGillasDeck(){
        
        final List<Card> gillasDeck = new ArrayList<>();
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().drawEffect(idGenerator.generateID(), "Mais", 2, 0, 1));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Granaio", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().healerEffect(idGenerator.generateID(), "Granaio", 4, 0, 2));
        this.playerIADeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Doppleganger-Mais", 2, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().elusiveEffect(idGenerator.generateID(), "Doppleganger-Mais", 2, 1, 2));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Spaventapasseri", 1, 2, 3));
        this.playerIADeck.add(new CardFactoyImpl().exaltedEffect(idGenerator.generateID(), "Spaventapasseri", 1, 2, 3));
        
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Chiesa del Mais", 0, 4, 4, "Cattedrale del Mais", 0, 8, Optional.of(new Armored())));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Chiesa del Mais", 0, 4, 4, "Cattedrale del Mais", 0, 8, Optional.of(new Armored())));
        
        
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Trebbia", 4, 0, 7, "Cupo Mietitore", 8, 8, Optional.of(new Poison())));
        this.playerIADeck.add(new CardFactoyImpl().growthEffect(idGenerator.generateID(), "Trebbia", 4, 0, 7, "Cupo Mietitore", 8, 8, Optional.of(new Poison())));
        this.playerIADeck.add(new CardFactoyImpl().noEffect(idGenerator.generateID(), "MAISxodia il proibito", 10, 10, 10));
       
        return gillasDeck;
    }

}
